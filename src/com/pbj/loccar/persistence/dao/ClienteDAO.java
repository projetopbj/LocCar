/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.persistence.ClientePersistence;
import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.EstadoCivil;
import com.pbj.loccar.model.Sexo;
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

/**
 *
 * @author Akr-Taku
 * 
 * Classe que persiste o cliente no sistema
 */
public class ClienteDAO implements ClientePersistence{
    
    //Salva Novo CLiente no Banco de Dados        
    @Override
    public void createCliente(Cliente cliente){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO cliente(nomeCliente,rgCliente,cpfCliente,estadoCivilCliente,"
                    + "sexoCliente,data_nascimentoCliente,emailCliente,telefoneCliente,celularCliente,ruaCliente,"
                    + "cepCliente,complementoCliente,bairroCliente,cidadeCliente,ufCliente)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            
            java.sql.Timestamp timestamp = new java.sql.Timestamp(cliente.getDataNascCliente().getTime());
            
            
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getRgCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setString(4, cliente.getEstadoCivilCliente().toString());
            stmt.setString(5, cliente.getSexoCliente().toString());
            stmt.setTimestamp(6, timestamp);
            stmt.setString(7, cliente.getEmailCliente());
            stmt.setString(8, cliente.getTelefoneCliente());
            stmt.setString(9, cliente.getCelularCliente());
            stmt.setString(10, cliente.getRuaCliente());
            stmt.setString(11, cliente.getCepCliente());
            stmt.setString(12, cliente.getComplementoCliente());
            stmt.setString(13, cliente.getBairroCliente());       
            stmt.setString(14, cliente.getCidadeCliente());
            stmt.setString(15, cliente.getUfCliente());
            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Cliente Salva no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Salvo no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
        
        
    }
        
    //Retorna A lista de todas os clientes do Banco de dados    
    @Override
    public List<Cliente> readCliente(){
        
        List<Cliente> listClientes = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente");
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                //Pega a categoria Pelo ID
                
                
                cliente.setId(rs.getInt("id"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRgCliente(rs.getString("rgCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setEstadoCivilCliente(EstadoCivil.valueOf(rs.getString("estadoCivilCliente")));
                cliente.setSexoCliente(Sexo.valueOf(rs.getString("sexoCliente")));
                cliente.setDataNascCliente(rs.getDate("data_nascimentoCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setCelularCliente(rs.getString("celularCliente"));
                cliente.setRuaCliente(rs.getString("ruaCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setComplementoCliente(rs.getString("complementoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));
        
             
                
                
                listClientes.add(cliente);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listClientes;
    }
    
     //Busca uma Lista de clientes pelo nome do cliente  
    @Override
    public List<Cliente> readCliente(String nome) {
        List<Cliente> listClientes = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente WHERE nomeCliente LIKE ?");
            
            stmt.setString(1, "%"+nome+"%");
           
            
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                //Pega a categoria Pelo ID
                cliente.setId(rs.getInt("id"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRgCliente(rs.getString("rgCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setEstadoCivilCliente(EstadoCivil.valueOf(rs.getString("estadoCivilCliente")));
                cliente.setSexoCliente(Sexo.valueOf(rs.getString("sexoCliente")));
                cliente.setDataNascCliente(rs.getDate("data_nascimentoCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setCelularCliente(rs.getString("celularCliente"));
                cliente.setRuaCliente(rs.getString("ruaCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setComplementoCliente(rs.getString("complementoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));             
                
                
                listClientes.add(cliente);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listClientes;
    }

    
    @Override
    public List<Cliente> readCliente(String cpf, boolean bool) {
        List<Cliente> listClientes = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente WHERE cpfCliente LIKE ?");
            
            stmt.setString(1, "%"+cpf+"%");
           
            
            rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                //Pega a categoria Pelo ID
                cliente.setId(rs.getInt("id"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRgCliente(rs.getString("rgCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setEstadoCivilCliente(EstadoCivil.valueOf(rs.getString("estadoCivilCliente")));
                cliente.setSexoCliente(Sexo.valueOf(rs.getString("sexoCliente")));
                cliente.setDataNascCliente(rs.getDate("data_nascimentoCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setCelularCliente(rs.getString("celularCliente"));
                cliente.setRuaCliente(rs.getString("ruaCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setComplementoCliente(rs.getString("complementoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));             
                
                
                listClientes.add(cliente);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listClientes;
    }
    
    //Retorna apenas um CLiente recebendo o CPF como parametro.
    @Override
    public Cliente retornaCliente(String cpf){
        Cliente cliente = new Cliente();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente WHERE cpfCliente = ?");
            
            stmt.setString(1, cpf);

            rs = stmt.executeQuery();
            
            
            if(rs.next()){
                cliente.setId(rs.getInt("id"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRgCliente(rs.getString("rgCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setEstadoCivilCliente(EstadoCivil.valueOf(rs.getString("estadoCivilCliente")));
                cliente.setSexoCliente(Sexo.valueOf(rs.getString("sexoCliente")));
                cliente.setDataNascCliente(rs.getDate("data_nascimentoCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setCelularCliente(rs.getString("celularCliente"));
                cliente.setRuaCliente(rs.getString("ruaCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setComplementoCliente(rs.getString("complementoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));
                
         
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return cliente;
    }
    
    //Retorna do Banco de dados um Cliente recebendo apenas o id
    @Override
    public Cliente retornaCliente(int id){
        Cliente cliente = new Cliente();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM cliente WHERE id = ?");
            
             stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            
            if(rs.next()){

                //Pega a categoria Pelo ID
                cliente.setId(rs.getInt("id"));
                cliente.setNomeCliente(rs.getString("nomeCliente"));
                cliente.setRgCliente(rs.getString("rgCliente"));
                cliente.setCpfCliente(rs.getString("cpfCliente"));
                cliente.setEstadoCivilCliente(EstadoCivil.valueOf(rs.getString("estadoCivilCliente")));
                cliente.setSexoCliente(Sexo.valueOf(rs.getString("sexoCliente")));
                cliente.setDataNascCliente(rs.getDate("data_nascimentoCliente"));
                cliente.setEmailCliente(rs.getString("emailCliente"));
                cliente.setTelefoneCliente(rs.getString("telefoneCliente"));
                cliente.setCelularCliente(rs.getString("celularCliente"));
                cliente.setRuaCliente(rs.getString("ruaCliente"));
                cliente.setCepCliente(rs.getString("cepCliente"));
                cliente.setComplementoCliente(rs.getString("complementoCliente"));
                cliente.setBairroCliente(rs.getString("bairroCliente"));
                cliente.setCidadeCliente(rs.getString("cidadeCliente"));
                cliente.setUfCliente(rs.getString("ufCliente"));

        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return cliente;
    }    
    
    //Recebe o Cliente e retorna e atualiza ele no Banco de dados
    @Override
    public void updateCliente(Cliente cliente){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("update cliente SET nomeCliente = ?,rgCliente = ?,cpfCliente = ?,estadoCivilCliente = ?,"
                    + "sexoCliente = ?,data_nascimentoCliente = ?,emailCliente = ?,telefoneCliente = ?,celularCliente = ?,"
                    + "ruaCliente = ?,cepCliente = ?,complementoCliente = ?,bairroCliente = ?,cidadeCliente = ?,ufCliente = ? WHERE id = ?");
                    
            java.sql.Timestamp timestamp = new java.sql.Timestamp(cliente.getDataNascCliente().getTime());
            
            stmt.setString(1, cliente.getNomeCliente());
            stmt.setString(2, cliente.getRgCliente());
            stmt.setString(3, cliente.getCpfCliente());
            stmt.setString(4, cliente.getEstadoCivilCliente().toString());
            stmt.setString(5, cliente.getSexoCliente().toString());
            stmt.setTimestamp(6, timestamp);
            stmt.setString(7, cliente.getEmailCliente());
            stmt.setString(8, cliente.getTelefoneCliente());
            stmt.setString(9, cliente.getCelularCliente());
            stmt.setString(10, cliente.getRuaCliente());
            stmt.setString(11, cliente.getCepCliente());
            stmt.setString(12, cliente.getComplementoCliente());
            stmt.setString(13, cliente.getBairroCliente());       
            stmt.setString(14, cliente.getCidadeCliente());
            stmt.setString(15, cliente.getUfCliente());
           
            stmt.setInt(16, cliente.getId());
         
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Cliente Atualizada no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    
    //Deleta o Cliente Informada do Banco de Dados
    @Override
    public void deleteCliente(Cliente cliente){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM cliente" + " WHERE id = ?");
            
            
            stmt.setInt(1, cliente.getId());
 
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Deletado do Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Deletar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }

  
}
