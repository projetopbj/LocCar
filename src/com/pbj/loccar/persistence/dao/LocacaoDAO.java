/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.Locacao;
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

/**
 *
 * @author Akr-Taku
 * 
 * Classe que persiste o locacao no sistema
 */
public class LocacaoDAO{
    
    //Salva Nova Locacao no Banco de Dados        
    public void createLocacao(Locacao locacao){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("INSERT INTO locacao(descricao,dataDoAluguel,qtdDias,dataDaDevolucao,"
                    + "idCliente,idVeiculo,desconto,valorDesconto,subTotal,statusLocacao)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            
            java.sql.Timestamp timeIda = new java.sql.Timestamp(locacao.getDataDoAluguel().getTime());
            java.sql.Timestamp timeVolta = new java.sql.Timestamp(locacao.getDataDaDevolucao().getTime());
            
            stmt.setString(1, locacao.getDescricao());
            
            stmt.setTimestamp(2, timeIda);
            stmt.setInt(3, locacao.getQtdDias());
            stmt.setTimestamp(4, timeVolta);
            
            stmt.setInt(5, locacao.getCliente().getId());
            stmt.setInt(6, locacao.getVeiculo().getId());
            
            stmt.setBoolean(7, locacao.isDesconto());
            stmt.setDouble(8, locacao.getValorDesconto());
            stmt.setDouble(9, locacao.getSubTotal());
            stmt.setBoolean(10, false);
          
            
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Locacao Salva no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
        
        
    }
        
    //Retorna A lista de todas os locacaos do Banco de dados    
    public List<Locacao> readLocacao(){
        
        List<Locacao> listLocacaos = new ArrayList<>();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM locacao");
            
           rs = stmt.executeQuery();
            
            
            while(rs.next()){
                Locacao locacao = new Locacao();
                //Seta o Veiculo pegando o ID
                Veiculo veiculo = new VeiculoDAO().retornaVeiculo(rs.getInt("idVeiculo"));
                //Seta o Clietne Pegando o ID
                Cliente cliente = new ClienteDAO().retornaCliente(rs.getInt("idCliente"));
                
                
                //
                locacao.setId(rs.getInt("id"));
                locacao.setDescricao(rs.getString("descricao"));
                locacao.setQtdDias(rs.getInt("qtdDias"));
                locacao.setDataDoAluguel(rs.getDate("dataDoAluguel"));
                locacao.setDataDaDevolucao(rs.getDate("dataDaDevolucao"));
                locacao.setSubTotal(rs.getDouble("subTotal"));
                locacao.setAtrasoLocacao(rs.getBoolean("atrasoLocacao"));
                locacao.setDiasAtraso(rs.getInt("diasAtraso"));
                locacao.setDataRetorno(rs.getDate("dataRetorno"));
                locacao.setValorFinal(rs.getDouble("valorFinal"));
                locacao.setDesconto(rs.getBoolean("desconto"));
                locacao.setValorDesconto(rs.getDouble("valorDesconto"));
                locacao.setStatusLocacao(rs.getBoolean("statusLocacao"));
                locacao.setCliente(cliente);
                locacao.setVeiculo(veiculo);

                listLocacaos.add(locacao);
        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
    }     
        return listLocacaos;
    }

   
    //Retorna do Banco de dados um Locacao recebendo apenas o id
    public Locacao retornaLocacao(int id){
        Locacao locacao = new Locacao();
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
     
        try {
            stmt = conn.prepareStatement("SELECT * FROM locacao WHERE id = ?");
            
             stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            
            if(rs.next()){

                Veiculo veiculo = new VeiculoDAO().retornaVeiculo(rs.getInt("idVeiculo"));
                //Seta o Clietne Pegando o ID
                Cliente cliente = new ClienteDAO().retornaCliente(rs.getInt("idCliente"));
                
                
                //
                locacao.setId(rs.getInt("id"));
                locacao.setDescricao(rs.getString("descricao"));
                locacao.setQtdDias(rs.getInt("qtdDias"));
                locacao.setDataDoAluguel(rs.getDate("dataDoAluguel"));
                locacao.setDataDaDevolucao(rs.getDate("dataDaDevolucao"));
                locacao.setSubTotal(rs.getDouble("subTotal"));
                locacao.setAtrasoLocacao(rs.getBoolean("atrasoLocacao"));
                locacao.setDiasAtraso(rs.getInt("diasAtraso"));
                locacao.setDataRetorno(rs.getDate("dataRetorno"));
                locacao.setValorFinal(rs.getDouble("valorFinal"));
                locacao.setDesconto(rs.getBoolean("deconto"));
                locacao.setValorDesconto(rs.getDouble("valorDesconto"));
                locacao.setStatusLocacao(rs.getBoolean("statusLocacao"));
                locacao.setCliente(cliente);
                locacao.setVeiculo(veiculo);

        }  
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally{
            ConnectionFactory.fecharConnection(conn, stmt, rs);
        
        }     
        
        
        return locacao;
    }    

   
    //Recebe o Locacao e retorna e atualiza ele no Banco de dados
    public void updateLocacao(Locacao locacao){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("update locacao SET descricao = ?,dataDoAluguel = ?,qtdDias = ?,dataDaDevolucao = ?,"
                    + "idCliente = ?,idVeiculo = ?,desconto = ?,valorDesconto = ?,subTotal = ? WHERE id = ?");
                    
            java.sql.Timestamp timeIda = new java.sql.Timestamp(locacao.getDataDoAluguel().getTime());
            java.sql.Timestamp timeVolta = new java.sql.Timestamp(locacao.getDataDaDevolucao().getTime());
            
            
            stmt.setString(1, locacao.getDescricao());
            
            stmt.setTimestamp(2, timeIda);
            stmt.setInt(3, locacao.getQtdDias());
            stmt.setTimestamp(4, timeVolta);
            
            stmt.setInt(5, locacao.getCliente().getId());
            stmt.setInt(6, locacao.getVeiculo().getId());
            
            stmt.setBoolean(7, locacao.isDesconto());
            stmt.setDouble(8, locacao.getValorDesconto());
            stmt.setDouble(9, locacao.getSubTotal());
            
            stmt.setInt(10, locacao.getId());
         
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Locacao Atualizada no Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Atualizar no Banco de Dados!" + ex, "Erro ao Salvar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }
    
    //Deleta o Locacao Informada do Banco de Dados
    public void deleteLocacao(Locacao locacao){
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = conn.prepareStatement("DELETE FROM locacao" + " WHERE id = ?");
            
            
            stmt.setInt(1, locacao.getId());
 
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "Deletado do Banco de Dados");

            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi Deletar no Banco de Dados!" + ex, "Erro ao Deletar",JOptionPane.ERROR_MESSAGE);
            
        }finally{
            
            ConnectionFactory.fecharConnection(conn, stmt);
        }
        
    }

  
}
