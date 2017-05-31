/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.util.Propriedade;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Akr-Taku
 */
public class ConnectionFactory {
    
    private static final Properties prop = Propriedade.getProp(".\\src\\com\\pbj\\loccar\\properties\\conn.properties");
    
    private static final  String DRIVER = prop.getProperty("prop.driver");
    private static final  String URL = prop.getProperty("prop.url");
    private static final  String USER = prop.getProperty("prop.user");
    private static final  String PASS = prop.getProperty("prop.pass");
    
    
    
    private ConnectionFactory(){
        
        
    }
    
    //Método para capturar uma conexão com o banco de dados;
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
                
            throw new RuntimeException("Erro ao Conectar ao Banco de Dados: ", ex);

        }
          
    }
    
    
   
    //Método Statico para fechar a Conexão passando a Connection, Statement, e ResultSet;
    public static void fecharConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        fecharConnection(con, stmt);
        
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    //Método Statico para fechar a Conexão passando a Connection, e Statement;
    public static void fecharConnection(Connection con, PreparedStatement stmt){
       
        fecharConnection(con);
          		
        if (stmt != null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }
    //Método Statico para fechar a Conexão passando a Connection;
    public static void fecharConnection(Connection con){
        
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
        
    }
    
    
    
}
