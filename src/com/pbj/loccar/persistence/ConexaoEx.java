package com.pbj.loccar.persistence;

import com.pbj.loccar.util.Propriedade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Classe exemplo para acesso via JDBC a uma base de dados no banco de dados Postgresql 9.4.
 *
 * @author jefferson - <jeffersonjpa@gmail.com> 
 * @date 31/10/2016
 * @version 1.0
 *
 */
public class ConexaoEx {
	
	private static Connection conn;
	private static Statement stmt;
	private static ResultSet rs;
        
        private static final Properties prop = Propriedade.getProp(".\\src\\com\\pbj\\loccar\\properties\\conn.properties");
        
        

	public static void main(String[] args) throws SQLException {
		
              Propriedade.setPropConn(".\\src\\com\\pbj\\loccar\\properties\\conn.properties","localhost","3306","loccar","root","0011");
            
            
		try {
			System.out.println("--- Antes de carregar o driver jdbc ---");
			
			Class.forName(prop.getProperty("prop.driver"));
			
			System.out.println("--- Depois de carregar o driver jdbc ---");
			
			String url = prop.getProperty("prop.url");
			String user = prop.getProperty("prop.user");
			String password = prop.getProperty("prop.pass");
			
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("--- Após estabelecer uma conexão com o banco de dados em localhost na porta 3306 ---");
			
			stmt = conn.createStatement();
			
			String sql = "select * from usuario";
			
			rs = stmt.executeQuery(sql);
			
			System.out.println("--- Após executar um statement (query) com o banco de dados ---");
			
			while(rs.next()) {
				int id = rs.getInt("idUser");
				String nome = rs.getString("NomeUser");
				String senha = rs.getString("SenhaUser");

				System.out.printf("ID: %d, Nome: %s, Senha: %s\n", id, nome, senha);
			}
			
			System.out.println("--- Depois de iterar por todos os registros do banco de dados ---");
		} catch (ClassNotFoundException | SQLException e) {
		} finally {
			if (conn != null)
				conn.close();
			
			if (stmt != null)
				stmt.close();

			if (rs != null)
				rs.close();
			System.out.println("--- Após encerrar as conexões. ---");
		}
	}

  
}