/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Categoria;
import java.util.List;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * Interface que possui os Métodos para Persistir a Categoria
 */
public interface CategoriaPersistence {

    //Salva Nova Categoria no Banco de Dados
    void createCategoria(Categoria categoria);

    //Deleta a categoria Informada do Banco de Dados
    void deleteCategoria(Categoria categoria);

    //Retorna A lista de todas as Cetegorias do Banco de dados
    List<Categoria> readCategoria();

    //Retorna apenas uma categoria recebendo o nome como parametro.
    Categoria retornaCategoria(String nome);

    //Retorna do Banco de dados uma Categoria recebendo apenas o id
    Categoria retornaCategoria(int id);

    //Recebe a Categoria e retorna e atualiza ele no Banco de dados
    void updateCategoria(Categoria categoria);
    
}
