/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akr-Taku
 */
public class Propriedade {

    //Recebe o Caminho Relativo do arquivo e retorna as properties
    public static Properties getProp(String path){

        try {
            
            Properties props = new Properties();
            
            String file;
            file = new File(path).getCanonicalPath();
            try (FileReader arquivo = new FileReader(file)) {
                props.load(arquivo);
            }
            
            return props;
        }   catch (IOException ex) {
            Logger.getLogger(Propriedade.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Recebe o Caminho Relativo da Properties atual e salva a nova properties
    public static void setPropConn(String path, String driver, String urlIp, String urlPorta, String urlBd, String user, String pass) throws IOException {

        Properties props = Propriedade.getProp(path);

        path = new File(path).getCanonicalPath();

        String url = "jdbc:mysql://" + urlIp + ":" + urlPorta + "/" + urlBd;

        props.setProperty("prop.driver", driver);
        props.setProperty("prop.url", url);
        props.setProperty("prop.user", user);
        props.setProperty("prop.pass", pass);

        props.setProperty("prop.url.ip", urlIp);
        props.setProperty("prop.url.porta", urlPorta);
        props.setProperty("prop.url.banco", urlBd);

        try (FileOutputStream out = new FileOutputStream(path)) {
            props.store(out, "----   Propriedades do Banco de Dados    ----");
        }

    }

    //Recebe o Caminho Relativo da Properties atual e salva a nova properties porém não passa drive
    public static void setPropConn(String path, String urlIp, String urlPorta, String urlBd, String user, String pass) throws IOException {

        setPropConn(path, "com.mysql.jdbc.Driver", urlIp, urlPorta, urlBd, user, pass);

    }

//Recebe o Caminho Relativo da Properties atual e salva a nova properties porém não passa drive, nem os dados de url
    public static void setPropConn(String path, String user, String pass) throws IOException {

        setPropConn(path, "localhost", "3306", "aula", user, pass);
    }

    //somente recebe os dados de login e senha
    public static void setPropConn(String user, String pass) throws IOException {
        setPropConn("properties/connection.properties", user, pass);

    }
}
