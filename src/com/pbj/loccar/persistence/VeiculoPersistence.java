/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Veiculo;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface VeiculoPersistence {

    //Salva Novo Veiculo no Banco de Dados
    void createVeiculo(Veiculo veiculo) throws SQLException;

    //Deleta o Veiculo Informada do Banco de Dados
    void deleteVeiculo(Veiculo veiculo) throws SQLException;

    //Retorna A lista de todas os veiculos do Banco de dados
    List<Veiculo> readVeiculo() throws SQLException;

    List<Veiculo> readVeiculo(boolean alugado) throws SQLException;

    List<Veiculo> readVeiculo(String modelo, boolean alugado) throws SQLException;

    List<Veiculo> readVeiculo(String modelo) throws SQLException;

    List<Veiculo> readVeiculo(int ano, boolean alugado) throws SQLException;

    List<Veiculo> readVeiculo(int ano) throws SQLException;

    //Retorna apenas uma categoria recebendo o nome como parametro.
    Veiculo retornaVeiculo(String modelo) throws SQLException;

    //Retorna do Banco de dados um Veiculo recebendo apenas o id
    Veiculo retornaVeiculo(int id) throws SQLException;

    //Recebe o Veiculo e retorna e atualiza ele no Banco de dados
    void updateVeiculo(Veiculo veiculo) throws SQLException;

    void updateVeiculo(Veiculo veiculo, boolean alugado) throws SQLException;
    
}
