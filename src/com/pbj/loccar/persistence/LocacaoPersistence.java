/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Locacao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface LocacaoPersistence {

    void closeLocacao(Locacao locacao) throws SQLException;

    //Salva Nova Locacao no Banco de Dados
    void createLocacao(Locacao locacao) throws SQLException;

    //Deleta o Locacao Informada do Banco de Dados
    void deleteLocacao(Locacao locacao) throws SQLException;

    //Retorna A lista de todas os locacaos do Banco de dados
    List<Locacao> readLocacao() throws SQLException;

    List<Locacao> readLocacao(boolean bool) throws SQLException;

    List<Locacao> readLocacao(boolean bool, String param) throws SQLException;

    List<Locacao> readLocacao(String param) throws SQLException;

    //Retorna do Banco de dados um Locacao recebendo apenas o id
    Locacao retornaLocacao(int id) throws SQLException;

    //Recebe o Locacao e retorna e atualiza ele no Banco de dados
    void updateLocacao(Locacao locacao) throws SQLException;
    
}
