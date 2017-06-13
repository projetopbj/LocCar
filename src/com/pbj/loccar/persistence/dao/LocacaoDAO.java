/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.persistence.LocacaoPersistence;
import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import com.pbj.loccar.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akr-Taku
 *
 * Classe que persiste o locacao no sistema
 */
public class LocacaoDAO implements LocacaoPersistence {

    //Salva Nova Locacao no Banco de Dados        
    @Override
    public void createLocacao(Locacao locacao) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

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

        ConnectionFactory.closeConnection(conn, stmt);

    }

    //Retorna A lista de todas os locacaos do Banco de dados    
    @Override
    public List<Locacao> readLocacao() throws SQLException {

        List<Locacao> listLocacaos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM locacao");

        rs = stmt.executeQuery();

        while (rs.next()) {
            try {
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
            } catch (ParseException ex) {
                Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ConnectionFactory.closeConnection(conn, stmt, rs);

        return listLocacaos;
    }

    @Override
    public List<Locacao> readLocacao(boolean bool) throws SQLException {

        List<Locacao> listLocacaos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM locacao WHERE statusLocacao = ?");

        stmt.setBoolean(1, bool);

        rs = stmt.executeQuery();

        while (rs.next()) {
            try {
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
            } catch (ParseException ex) {
                Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ConnectionFactory.closeConnection(conn, stmt, rs);

        return listLocacaos;
    }

    @Override
    public List<Locacao> readLocacao(boolean bool, String param) throws SQLException {

        List<Locacao> listLocacaos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM locacao WHERE statusLocacao = ? AND descricao Like ? OR dataDoAluguel Like ?");

        stmt.setBoolean(1, bool);
        stmt.setString(2, "%" + param + "%");
        stmt.setString(3, "%" + param + "%");

        rs = stmt.executeQuery();

        while (rs.next()) {
            try {
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
            } catch (ParseException ex) {
                Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        ConnectionFactory.closeConnection(conn, stmt, rs);

        return listLocacaos;
    }

    @Override
    public List<Locacao> readLocacao(String param) throws SQLException {

        List<Locacao> listLocacaos = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM locacao WHERE descricao Like ? OR dataDoAluguel Like ?");

        stmt.setString(1, "%" + param + "%");
        stmt.setString(2, "%" + param + "%");

        rs = stmt.executeQuery();

        while (rs.next()) {
            try {
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
            } catch (ParseException ex) {
                Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ConnectionFactory.closeConnection(conn, stmt, rs);

        return listLocacaos;
    }

    //Retorna do Banco de dados um Locacao recebendo apenas o id
    @Override
    public Locacao retornaLocacao(int id) throws SQLException {
        try {
            Locacao locacao = new Locacao();
            
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt;
            ResultSet rs;
            
            stmt = conn.prepareStatement("SELECT * FROM locacao WHERE id = ?");
            
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                
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
                
            }
            
            ConnectionFactory.closeConnection(conn, stmt, rs);
            
            return locacao;
        } catch (ParseException ex) {
            Logger.getLogger(LocacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Recebe o Locacao e retorna e atualiza ele no Banco de dados
    @Override
    public void updateLocacao(Locacao locacao) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

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

        ConnectionFactory.closeConnection(conn, stmt);

    }

    @Override
    public void closeLocacao(Locacao locacao) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

        stmt = conn.prepareStatement("update locacao SET atrasoLocacao = ?,diasAtraso = ?,dataRetorno = ?,valorFinal = ?,"
                + "statusLocacao = ? WHERE id = ?");

        java.sql.Timestamp timeVolta = new java.sql.Timestamp(locacao.getDataRetorno().getTime());

        new VeiculoDAO().updateVeiculo(locacao.getVeiculo(), false);

        stmt.setBoolean(1, locacao.isAtrasoLocacao());

        stmt.setInt(2, locacao.getDiasAtraso());

        stmt.setTimestamp(3, timeVolta);

        stmt.setDouble(4, locacao.getValorFinal());

        stmt.setBoolean(5, locacao.isStatusLocacao());

        stmt.setInt(6, locacao.getId());

        stmt.executeUpdate();

        ConnectionFactory.closeConnection(conn, stmt);

    }

    //Deleta o Locacao Informada do Banco de Dados
    @Override
    public void deleteLocacao(Locacao locacao) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

        stmt = conn.prepareStatement("DELETE FROM locacao" + " WHERE id = ?");

        stmt.setInt(1, locacao.getId());

        stmt.executeUpdate();

        ConnectionFactory.closeConnection(conn, stmt);

    }

}
