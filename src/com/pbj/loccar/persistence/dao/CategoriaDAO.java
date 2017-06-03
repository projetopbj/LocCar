/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.model.Categoria;
import com.pbj.loccar.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.pbj.loccar.persistence.CategoriaPersistence;

/**
 *
 * @author Akr-Taku
 */
public class CategoriaDAO implements CategoriaPersistence {
    
    //Salva Nova Categoria no Banco de Dados    
    @Override
    public void createCategoria(Categoria categoria){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO categoria(id,nome,valorDia,valorKm,ar,vidro,direcao)VALUES(?,?,?,?,?,?,?)");
            
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getNome());
            stmt.setDouble(3, categoria.getValorDia());
            stmt.setDouble(4, categoria.getValorKm());
            stmt.setBoolean(5, categoria.isAr());
            stmt.setBoolean(6, categoria.isVidro());
            stmt.setBoolean(7, categoria.isDirecao());
            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Categoria Salva no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Salvo no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
        
        
    }
        
    //Retorna A lista de todas as Cetegorias do Banco de dados    
    @Override
    public List<Categoria> readCategoria(){
        
        List<Categoria> listCategoria = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM categoria");
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Categoria categoria = new Categoria();
                
                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categoria.setValorDia(rs.getDouble("valorDia"));
                categoria.setValorKm(rs.getDouble("valorKm"));
                categoria.setAr(rs.getBoolean("ar"));
                categoria.setVidro(rs.getBoolean("vidro"));
                categoria.setDirecao(rs.getBoolean("direcao"));
                
                
                listCategoria.add(categoria);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listCategoria;
    }
    
    //Retorna apenas uma categoria recebendo o nome como parametro.
    @Override
    public Categoria retornaCategoria(String nome){
        Categoria categoria = new Categoria();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM categoria WHERE nome = ?");
            
            stmt.setString(1, nome);

            rs = stmt.executeQuery();
            
            
            if(rs.next()){

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categoria.setValorDia(Double.parseDouble(rs.getString("valorDia")));
                categoria.setValorKm(Double.parseDouble(rs.getString("valorKm")));
                categoria.setAr(Boolean.getBoolean((rs.getString("ar"))));
                categoria.setVidro(Boolean.getBoolean(rs.getString("vidro")));
                categoria.setDirecao(Boolean.getBoolean(rs.getString("direcao")));
                
         
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return categoria;
    }
    
    //Retorna do Banco de dados uma Categoria recebendo apenas o id
    @Override
    public Categoria retornaCategoria(int id){
        Categoria categoria = new Categoria();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM categoria WHERE id = ?");
            
             stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            
            if(rs.next()){

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categoria.setValorDia(rs.getDouble("valorDia"));
                categoria.setValorKm(rs.getDouble("valorKm"));
                categoria.setAr(rs.getBoolean("ar"));
                categoria.setVidro(rs.getBoolean("vidro"));
                categoria.setDirecao(rs.getBoolean("direcao"));
                
         
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return categoria;
    }    
    
    //Recebe a Categoria e retorna e atualiza ele no Banco de dados
    @Override
    public void updateCategoria(Categoria categoria){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE categoria SET nome = ?,valorDia = ? ,valorKm = ?,ar = ?,vidro = ?,direcao = ? WHERE id = ?");
            
            
            stmt.setString(1, categoria.getNome());
            stmt.setDouble(2, categoria.getValorDia());
            stmt.setDouble(3, categoria.getValorKm());
            stmt.setBoolean(4, categoria.isAr());
            stmt.setBoolean(5, categoria.isVidro());
            stmt.setBoolean(6, categoria.isDirecao());
            
            stmt.setInt(7, categoria.getId());
                    
                    
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Categoria Atualizada no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    
    //Deleta a categoria Informada do Banco de Dados
    @Override
    public void deleteCategoria(Categoria categoria){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM categoria WHERE id = ?");
            
            
            stmt.setInt(1, categoria.getId());
 
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Deletado do Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Deletar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    
    
}
