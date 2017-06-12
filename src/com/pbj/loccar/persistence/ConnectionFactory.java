
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Propriedade;
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
 * 
 * 
 * Classe que faz a Connexão Com o Banco de Dados
 */
public class ConnectionFactory {
    
    
    //Constantes Capturadas diretamente do Arquivo de Propriedades
    private static final Properties prop = Propriedade.getProp("properties\\connection.properties");
    private static final String DRIVER = prop.getProperty("prop.driver");
    private static final String URL = prop.getProperty("prop.url");
    private static final String USER = prop.getProperty("prop.user");
    private static final String PASS = prop.getProperty("prop.pass");
    
    /**
     *Construtor Vazio e privado para classe não ser instanciada
     */
    private ConnectionFactory(){
       //Não tem Nada aqui! 
    }
    
    
    /**
     * @return 
     * Método para capturar uma conexão com o banco de dados;
     * Metodo retorna uma conexão
     */
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
