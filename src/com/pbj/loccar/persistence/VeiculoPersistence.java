/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Veiculo;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface VeiculoPersistence {

    //Salva Novo Veiculo no Banco de Dados
    void createVeiculo(Veiculo veiculo);

    //Deleta o Veiculo Informada do Banco de Dados
    void deleteVeiculo(Veiculo veiculo);

    //Retorna A lista de todas os veiculos do Banco de dados
    List<Veiculo> readVeiculo();
    
    List<Veiculo> readVeiculo(String modelo, boolean alugado);
    
    List<Veiculo> readVeiculo(String modelo);
    
    List<Veiculo> readVeiculo(int ano);
    
    List<Veiculo> readVeiculo(boolean alugado);

    
    List<Veiculo> readVeiculo(int ano, boolean alugado);
    
    //Retorna apenas uma categoria recebendo o nome como parametro.
    Veiculo retornaVeiculo(String placa);

    //Retorna do Banco de dados um Veiculo recebendo apenas o id
    Veiculo retornaVeiculo(int id);

    //Recebe o Veiculo e retorna e atualiza ele no Banco de dados
    void updateVeiculo(Veiculo veiculo);
    
}
