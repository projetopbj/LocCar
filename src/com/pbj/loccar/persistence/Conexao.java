/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lucas
 */
public class Conexao {
    private static Connection con;
    private static String url;
    private static String username = "root";
    private static String password = "lucas";
    
//    passar o url,username e password como sendo root,...
    public Connection getConnection(){
        
        if(con == null){
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                System.out.println("Erro ao conectar com o banco " + e);
            }
        }
        return con;
    }
    
    
}
