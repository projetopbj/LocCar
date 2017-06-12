/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import com.pbj.loccar.model.Locacao;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public interface LocacaoPersistence {

    void closeLocacao(Locacao locacao);

    //Salva Nova Locacao no Banco de Dados
    void createLocacao(Locacao locacao);

    //Deleta o Locacao Informada do Banco de Dados
    void deleteLocacao(Locacao locacao);

    //Retorna A lista de todas os locacaos do Banco de dados
    List<Locacao> readLocacao();

    List<Locacao> readLocacao(boolean bool);

    List<Locacao> readLocacao(boolean bool, String param);

    List<Locacao> readLocacao(String param);

    //Retorna do Banco de dados um Locacao recebendo apenas o id
    Locacao retornaLocacao(int id);

    //Recebe o Locacao e retorna e atualiza ele no Banco de dados
    void updateLocacao(Locacao locacao);
    
}
