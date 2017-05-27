/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.util.Propriedade;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Akr-Taku
 */
public class PropriedadeControl {
    
    public static boolean salvarProp(String urlIp,String urlPorta,String urlBd, String user, String pass){
        boolean bool;
        
        Propriedade.setPropConn(".\\src\\com\\pbj\\loccar\\properties\\conn.properties",urlIp,urlPorta,urlBd,user,pass);
        
        
        
        return true;
    }
    
    public static ArrayList<String> retornarProp(){
        
        ArrayList<String> props;
        
        
        props = new ArrayList<>();
        
        Properties prop = Propriedade.getProp(".\\src\\com\\pbj\\loccar\\properties\\conn.properties");
        
        String host = prop.getProperty("prop.url.ip");

        props.add(host);
        
        String porta = prop.getProperty("prop.url.porta");
        
        props.add(porta);
        
        String banco = prop.getProperty("prop.url.banco");
        
        props.add(banco);
        
        String user = prop.getProperty("prop.user");
        
        props.add(user);
        
        String pass = prop.getProperty("prop.pass");
        
        props.add(pass);
        
        return props;  
    }
    
}
