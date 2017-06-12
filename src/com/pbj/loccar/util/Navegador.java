/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.util;

import java.lang.reflect.Method;
import javax.swing.JOptionPane;

/**
 *
 * @author Aleff
 * 
 * Classe util que Possui funções com o navegador
 */
public class Navegador {  
    
   /* 
   
    Método que recebe um endereço de web ou arquivo que possa ser aberto no 
    navegador e abre navegador em qualquer OS
   */
    public static void openURL(String url)
    {
        String osName = System.getProperty("os.name");
        try
        {
            if (osName.startsWith("Mac OS"))
            {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",
                    new Class[] {String.class});
                openURL.invoke(null, new Object[] {url});
            }
            else if (osName.startsWith("Windows"))
                Runtime.getRuntime().exec("cmd.exe /C start " + url);
            else
            { //assume Unix or Linux
                String[] browsers = {
                    "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++)
                    if (Runtime.getRuntime().exec(
                    new String[] {"which", browsers[count]}).waitFor() == 0)
                        browser = browsers[count];
                if (browser == null)
                    throw new Exception("Navegador não encontrado!");
                else
                    Runtime.getRuntime().exec(new String[] {browser, url});
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao tentar abrir o browser" + ":\n" + e.getLocalizedMessage());
        }
    }
    
    
}
