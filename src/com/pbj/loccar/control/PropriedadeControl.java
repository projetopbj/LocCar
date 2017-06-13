/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Propriedade;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author Akr-Taku
 *
 * Classe de Controle que tem acesso ao Model, View e DAO - Das Properties do
 * Banco de Dados
 */
public class PropriedadeControl {

    //Salva as Propriedades Recebendo Varios Dados como Parâmetro //Retorna Verdadeiro se Não der Errado
    public static boolean salvarProp(String urlIp, String urlPorta, String urlBd, String user, String pass) throws IOException {
        boolean bool;

        //Chamando o método da Utíl para Setar as informações no arquivo
        Propriedade.setPropConn("properties/connection.properties", urlIp, urlPorta, urlBd, user, pass);

        return true;
    }

    //Retorna a Lista De parâmetros diretamente do arquivo
    public static ArrayList<String> retornarProp() throws IOException {

        ArrayList<String> props;

        props = new ArrayList<>();

        Properties prop = Propriedade.getProp("properties/connection.properties");

        String host = prop.getProperty("prop.url.ip");

        props.add(host);

        String porta = prop.getProperty("prop.url.porta");

        props.add(porta);

        String banco = prop.getProperty("prop.url.banco");

        props.add(banco);

        String user = prop.getProperty("prop.user");

        props.add(user);

        String pass = prop.getProperty("prop.pass");

        props.add(pass);

        return props;
    }

}
