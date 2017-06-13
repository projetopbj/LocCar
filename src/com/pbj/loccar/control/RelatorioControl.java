/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.persistence.ConnectionFactory;
import com.pbj.loccar.util.Relatorio;
import java.io.IOException;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author Akr-Taku
 */
public class RelatorioControl {

    public static void geraRelatorio(String arq) throws IOException, JRException, SQLException {

        Relatorio relat = new Relatorio();

        relat.gerador("./src/com/pbj/loccar/ireport/" + arq + ".jasper", ConnectionFactory.getConnection());

    }

}
