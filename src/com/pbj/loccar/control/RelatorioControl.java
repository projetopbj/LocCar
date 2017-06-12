/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.persistence.ConnectionFactory;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Akr-Taku
 */
public class RelatorioControl {
    
    
    Connection conn = ConnectionFactory.getConnection();
    
  public void relatorio() throws JRException, IOException{
    
    String path = ".\\src\\com\\pbj\\loccar\\properties\\Locacoes.jasper";
    
    String file = new File(path).getCanonicalPath();
    
    
        JasperPrint jasperPrint;
    
        jasperPrint = JasperFillManager.fillReport(file, null,conn);
    
        JasperViewer view = new JasperViewer(jasperPrint,false);
        
        view.setVisible(true);
    
    }
}
