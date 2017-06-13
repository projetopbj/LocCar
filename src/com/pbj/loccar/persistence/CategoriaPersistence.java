/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Categoria;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface CategoriaPersistence {

    //Salva Nova Categoria no Banco de Dados
    /**
     *
     * @param categoria
     * @throws SQLException
     */
    void createCategoria(Categoria categoria) throws SQLException;

    //Deleta a categoria Informada do Banco de Dados
    void deleteCategoria(Categoria categoria) throws SQLException;

    //Retorna A lista de todas as Cetegorias do Banco de dados
    List<Categoria> readCategoria() throws SQLException;

    //Retorna apenas uma categoria recebendo o nome como parametro.
    Categoria retornaCategoria(String nome) throws SQLException;

    //Retorna do Banco de dados uma Categoria recebendo apenas o id
    Categoria retornaCategoria(int id) throws SQLException;

    //Recebe a Categoria e retorna e atualiza ele no Banco de dados
    void updateCategoria(Categoria categoria) throws SQLException;
    
}
