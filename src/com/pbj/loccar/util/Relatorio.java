/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.util;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Akr-Taku
 */
public class Relatorio {

    /**
     *
     * @param path
     * @param conn
     * @throws IOException
     * @throws JRException
     * @throws SQLException
     */
    public void gerador(String path, Connection conn) throws IOException, JRException, SQLException {

        String file;
        file = new File(path).getCanonicalPath();
        JasperPrint jasperPrint;

        jasperPrint = JasperFillManager.fillReport(file, null, conn);

        JasperViewer view = new JasperViewer(jasperPrint, false);

        view.setVisible(true);
        
        conn.close();

    }
}
