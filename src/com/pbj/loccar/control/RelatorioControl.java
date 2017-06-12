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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
  public void relatorio(String arq){

    String path = ".\\src\\com\\pbj\\loccar\\ireport\\" + arq +".jasper";
    
    String file = null;
      try {
          file = new File(path).getCanonicalPath();
      } catch (IOException ex) {
          Logger.getLogger(RelatorioControl.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    
        JasperPrint jasperPrint = null;
    
      try {
          jasperPrint = JasperFillManager.fillReport(file, null,conn);
      } catch (JRException ex) {
          Logger.getLogger(RelatorioControl.class.getName()).log(Level.SEVERE, null, ex);
      }
    
        JasperViewer view = new JasperViewer(jasperPrint,false);
        
        view.setVisible(true);
    
    }
}
