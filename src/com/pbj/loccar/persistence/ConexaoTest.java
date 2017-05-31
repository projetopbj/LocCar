package com.pbj.loccar.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe exemplo para acesso via JDBC a uma base de dados no banco de dados Postgresql 9.4.
 *
 * @author jefferson - <jeffersonjpa@gmail.com> 
 * @date 31/10/2016
 * @version 1.0
 *
 */
public class ConexaoTest {
	
	private static Connection conn; 
	private static PreparedStatement stmt;
	private static ResultSet rs;
        
;
        
        

        
	public static void main(String[] args) throws SQLException {
		
           
            
            conn = ConnectionFactory.getConnection();
            
            System.out.println("--- Após estabelecer uma conexão com o banco de dados em localhost na porta 3306 ---");
            
            try{
	
                String sql = "select * from usuario";
                        
                stmt = conn.prepareStatement(sql);
             
                rs = stmt.executeQuery(sql);
			
                System.out.println("--- Após executar um statement (query) com o banco de dados ---");
			
                while(rs.next()) {
                    int id = rs.getInt("idUser");
                    String nome = rs.getString("nomeUser");
                    String senha = rs.getString("senhaUser");

                    System.out.printf("ID: %d, Nome: %s, Senha: %s\n", id, nome, senha);
                }
                
                System.out.println("--- Depois de iterar por todos os registros do banco de dados ---");
                
            }catch(SQLException ex){
                System.err.print("Tabela não existe no banco de dados \n"+ex+"\n");
                
            }finally{

            

                ConnectionFactory.fecharConnection(conn, stmt, rs);


                System.out.println("--- Após encerrar as conexões. ---");
            }
	}



}

  
