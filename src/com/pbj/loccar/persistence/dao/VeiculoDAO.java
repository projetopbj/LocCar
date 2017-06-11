/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.model.Categoria;
import com.pbj.loccar.model.Veiculo;
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
import com.pbj.loccar.persistence.VeiculoPersistence;

/**
 *
 * @author Akr-Taku
 */
public class VeiculoDAO implements VeiculoPersistence {
    
    //Salva Novo Veiculo no Banco de Dados    
    @Override
    public void createVeiculo(Veiculo veiculo){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO veiculo(placa,modelo,chassi,marca,cor,ano,numPortas,idCategoria,alugado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getChassi());
            stmt.setString(4, veiculo.getMarca());
            stmt.setString(5, veiculo.getCor());
            stmt.setInt(6, veiculo.getAno());
            stmt.setInt(7, veiculo.getnPortas());
            stmt.setInt(8, veiculo.getCategoria().getId());
            stmt.setBoolean(9, false);
            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Veiculo Salva no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Salvo no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
        
        
    }
        
    //Retorna A lista de todas os veiculos do Banco de dados    
    @Override
    public List<Veiculo> readVeiculo(){
        
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo");
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
    }
    @Override
    
    public List<Veiculo> readVeiculo(boolean alugado) {
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE alugado = ?");
            
            stmt.setBoolean(1, alugado);
            
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
    }
    
    public List<Veiculo> readVeiculo(String modelo, boolean alugado) {
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE modelo LIKE ? AND alugado = ?");
            
            stmt.setString(1, "%"+modelo+"%");
            stmt.setBoolean(2, alugado);
            
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
    }
    
    public List<Veiculo> readVeiculo(String modelo) {
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE modelo LIKE ?");
            
            stmt.setString(1, "%"+modelo+"%");
           
            
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
    }

    @Override
    public List<Veiculo> readVeiculo(int ano, boolean alugado) {
        
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE ano LIKE ? AND alugado = ?");
            
            stmt.setInt(1, ano);
            stmt.setBoolean(2, alugado);
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
        
    }  
    
    public List<Veiculo> readVeiculo(int ano) {
        
        List<Veiculo> listVeiculos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE ano LIKE ?");
            
            stmt.setInt(1, ano);
            
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Veiculo veic = new Veiculo();
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
             
                
                
                listVeiculos.add(veic);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listVeiculos;
        
    } 
    
    //Retorna apenas uma categoria recebendo o nome como parametro.
    @Override
    public Veiculo retornaVeiculo(String modelo){
        Veiculo veic = new Veiculo();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE modelo = ?");
            
            stmt.setString(1, modelo);

            rs = stmt.executeQuery();
            
            
            if(rs.next()){
                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));
                
         
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return veic;
    }
    
    //Retorna do Banco de dados um Veiculo recebendo apenas o id
    @Override
    public Veiculo retornaVeiculo(int id){
        Veiculo veic = new Veiculo();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM veiculo WHERE id = ?");
            
             stmt.setInt(1, id);
             
            
            rs = stmt.executeQuery();
            
            
            if(rs.next()){

                //Pega a categoria Pelo ID
                Categoria categ = new CategoriaDAO().retornaCategoria(rs.getInt("idCategoria"));
                
                veic.setId(rs.getInt("id"));
                veic.setAno(rs.getInt("ano"));
                veic.setnPortas(rs.getInt("numPortas"));
                veic.setCategoria(categ); //Seta a categoria no objeto
                veic.setModelo(rs.getString("modelo"));
                veic.setMarca(rs.getString("marca"));
                veic.setPlaca(rs.getString("placa"));
                veic.setChassi(rs.getString("chassi"));
                veic.setCor(rs.getString("cor"));
                veic.setAlugado(rs.getBoolean("alugado"));

        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return veic;
    }    
    
    //Recebe o Veiculo e retorna e atualiza ele no Banco de dados
    @Override
    public void updateVeiculo(Veiculo veiculo){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE veiculo SET placa = ?,modelo = ? ,chassi = ?,marca = ?,cor = ?,ano = ?,numportas = ?, idCategoria = ? WHERE id = ?");
            
            
            stmt.setString(1, veiculo.getPlaca());
            stmt.setString(2, veiculo.getModelo());
            stmt.setString(3, veiculo.getChassi());
            stmt.setString(4, veiculo.getMarca());
            stmt.setString(5, veiculo.getCor());
            stmt.setInt(6, veiculo.getAno());
            stmt.setInt(7, veiculo.getnPortas());
            stmt.setInt(8, veiculo.getCategoria().getId());
           
            stmt.setInt(9, veiculo.getId());
         
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Veiculo Atualizada no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    
    
    public void updateVeiculo(Veiculo veiculo, boolean alugado){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("UPDATE veiculo SET alugado = ? WHERE id = ?");
            
            
            stmt.setBoolean(1, alugado);
           
            stmt.setInt(2, veiculo.getId());
         
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Veiculo Atualizada no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }

    
    //Deleta o Veiculo Informada do Banco de Dados
    @Override
    public void deleteVeiculo(Veiculo veiculo){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM veiculo" + " WHERE id = ?");
            
            
            stmt.setInt(1, veiculo.getId());
 
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Deletado do Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Deletar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }

  
}
