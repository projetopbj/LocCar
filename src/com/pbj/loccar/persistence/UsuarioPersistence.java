/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface UsuarioPersistence {

    /*
    Recebe objeto Usuario e salva no banco de dados;
     */
    void createUsuario(Usuario user) throws SQLException;
    //Retorna os dados do usuario que vieram diretamete do banco de dados;

    //Recebe o Usuario e Apaga o registro no banco
    void deleteUsuario(Usuario user) throws SQLException;

    Usuario loginUsuario(String login, String senha) throws SQLException;

    List<Usuario> readUsuario() throws SQLException;

    //Recebe um Usuario e atualiza ele no BAnco de dados
    void updateUsuario(Usuario user) throws SQLException;
    
}
