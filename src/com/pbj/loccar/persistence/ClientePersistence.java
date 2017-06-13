/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Cliente;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface ClientePersistence {

    //Salva Novo CLiente no Banco de Dados
    void createCliente(Cliente cliente) throws SQLException;

    //Deleta o Cliente Informada do Banco de Dados
    void deleteCliente(Cliente cliente) throws SQLException;

    //Retorna A lista de todas os clientes do Banco de dados
    List<Cliente> readCliente() throws SQLException;

    //Busca uma Lista de clientes pelo nome do cliente
    List<Cliente> readCliente(String nome) throws SQLException;

    List<Cliente> readCliente(String cpf, boolean bool) throws SQLException;

    //Retorna apenas um CLiente recebendo o CPF como parametro.
    Cliente retornaCliente(String cpf) throws SQLException;

    //Retorna do Banco de dados um Cliente recebendo apenas o id
    Cliente retornaCliente(int id) throws SQLException;

    //Recebe o Cliente e retorna e atualiza ele no Banco de dados
    void updateCliente(Cliente cliente) throws SQLException;
    
}
