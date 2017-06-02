/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.model.Usuario;
import com.pbj.loccar.persistence.ConnectionFactory;
import com.pbj.loccar.persistence.UsuarioPersistence;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akr-Taku
 */
public class UsuarioDAO implements UsuarioPersistence {
    
    
   /*
        Recebe objeto Usuario e salva no banco de dados;
    */
    @Override
    public void createUsuario(Usuario user){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO usuario(id,loginUser,nomeUser,senhaUser,acessoUser)VALUES(?,?,?,?,?)");
            
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getLoginUser());
            stmt.setString(3, user.getNomeUser());
            stmt.setString(4, user.getSenhaUser());
            stmt.setString(5, user.getAcessoUser());
            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Usuário Salvo no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Salvo no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
        
        
    }
    //Retorna os dados do usuario que vieram diretamete do banco de dados;
    @Override
    public List<Usuario> readUsuario(){
        
        List<Usuario> users = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM usuario");
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Usuario user = new Usuario();
                
                user.setId(rs.getInt("id"));
                user.setLoginUser(rs.getString("loginUser"));
                user.setNomeUser(rs.getString("nomeUser"));
                user.setAcessoUser(rs.getString("acessoUser"));
                user.setSenhaUser(rs.getString("senhaUser"));
                
                
                users.add(user);
        }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }
        
        
        
        
        
        return users;
    }
    
    @Override
    public Usuario loginUsuario(String login,String senha){
        
         Usuario user = new Usuario();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM usuario WHERE loginUser = ? AND senhaUser = ?");
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
           rs = stmt.executeQuery();
           if(rs.next()){     
            user.setId(rs.getInt("id"));
            user.setLoginUser(rs.getString("loginUser"));
            user.setNomeUser(rs.getString("nomeUser"));
            user.setAcessoUser(rs.getString("acessoUser"));
            user.setSenhaUser(rs.getString("senhaUser"));
           }

            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }
        
        return user;
    }
    
    
    @Override
    //Recebe um Usuario e atualiza ele no BAnco de dados
    public void updateUsuario(Usuario user){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE usuario SET loginUser = ?,nomeUser = ? ,senhaUser = ?,acessoUser = ? WHERE id = ?");
            
            
            stmt.setString(1, user.getLoginUser());
            stmt.setString(2, user.getNomeUser());
            stmt.setString(3, user.getSenhaUser());
            stmt.setString(4, user.getAcessoUser());
            stmt.setInt(5, user.getId());
                    
                    
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Usuário Atualizado no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    //Recebe o Usuario e Apaga o registro no banco
    @Override
    public void deleteUsuario(Usuario user){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM usuario WHERE id = ?");
            
            
            stmt.setInt(1, user.getId());
 
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Deletado do Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Deletar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
}
