/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.EstadoCivil;
import com.pbj.loccar.model.Sexo;
import com.pbj.loccar.persistence.ClientePersistence;
import com.pbj.loccar.persistence.dao.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Akr-Taku
 *
 *
 * Classe de Controle que tem acesso ao Model, View e DAO - Da Cliente
 */
public class ClienteControl {

    //Salva o Cliente no Banco de dados
    /**
     *
     * @param nome
     * @param rg
     * @param cpf
     * @param estadoCivil
     * @param sexo
     * @param dataNasc
     * @param email
     * @param telefone
     * @param celular
     * @param rua
     * @param cep
     * @param complemento
     * @param bairro
     * @param cidade
     * @param uf
     */
    public static void salvarCliente(String nome, String rg, String cpf, String estadoCivil, String sexo,
            Date dataNasc, String email, String telefone, String celular, String rua, String cep,
            String complemento, String bairro, String cidade, String uf) throws SQLException {

        Cliente cliente = new Cliente();

        cliente.setNomeCliente(nome);
        cliente.setRgCliente(rg);
        cliente.setCpfCliente(cpf);
        cliente.setEstadoCivilCliente(EstadoCivil.valueOf(estadoCivil));
        cliente.setSexoCliente(Sexo.valueOf(sexo));
        cliente.setDataNascCliente(dataNasc);
        cliente.setEmailCliente(email);
        cliente.setTelefoneCliente(telefone);
        cliente.setCelularCliente(celular);
        cliente.setRuaCliente(rua);
        cliente.setCepCliente(cep);
        cliente.setComplementoCliente(complemento);
        cliente.setBairroCliente(bairro);
        cliente.setCidadeCliente(cidade);
        cliente.setUfCliente(uf);

        new ClienteDAO().createCliente(cliente);

    }

    /*
    Converte o retorno Lista de Clientes do DAO e Converte em Vetor de String 
    0 = id      
    1 = nome    
    2 = rg 
    3 = cpf 
    4 = estado civil      
    5 = sexo   
    6 = data nascimento
    7 = email
    8 = telefone
    9 = celular
    10 = rua
    11 = cep
    12 = complemento
    13 = bairro
    14 = cidade
    15 = UF
     */
    public static List<String[]> lerCliente(String cpf, boolean gambiarra) throws SQLException {

        List<String[]> clientes = new ArrayList<>();

        List<Cliente> clienList = new ClienteDAO().readCliente(cpf, gambiarra);

        for (int i = 0; i < clienList.size(); i++) {

            String clienTemp[] = new String[16];

            clienTemp[0] = Integer.toString(clienList.get(i).getId());
            clienTemp[1] = clienList.get(i).getNomeCliente();
            clienTemp[2] = clienList.get(i).getRgCliente();
            clienTemp[3] = clienList.get(i).getCpfCliente();
            clienTemp[4] = clienList.get(i).getEstadoCivilCliente().toString();
            clienTemp[5] = clienList.get(i).getSexoCliente().toString();
            clienTemp[6] = clienList.get(i).getDataNascCliente().toString();
            clienTemp[7] = clienList.get(i).getEmailCliente();
            clienTemp[8] = clienList.get(i).getTelefoneCliente();
            clienTemp[9] = clienList.get(i).getCelularCliente();
            clienTemp[10] = clienList.get(i).getRuaCliente();
            clienTemp[11] = clienList.get(i).getCepCliente();
            clienTemp[12] = clienList.get(i).getComplementoCliente();
            clienTemp[13] = clienList.get(i).getBairroCliente();
            clienTemp[14] = clienList.get(i).getCidadeCliente();
            clienTemp[15] = clienList.get(i).getUfCliente();

            clientes.add(clienTemp);
        }
        return clientes;
    }

    public static List<String[]> lerCliente(String nome) throws SQLException {

        List<String[]> clientes = new ArrayList<>();

        List<Cliente> clienList = new ClienteDAO().readCliente(nome);

        for (int i = 0; i < clienList.size(); i++) {

            String clienTemp[] = new String[16];

            clienTemp[0] = Integer.toString(clienList.get(i).getId());
            clienTemp[1] = clienList.get(i).getNomeCliente();
            clienTemp[2] = clienList.get(i).getRgCliente();
            clienTemp[3] = clienList.get(i).getCpfCliente();
            clienTemp[4] = clienList.get(i).getEstadoCivilCliente().toString();
            clienTemp[5] = clienList.get(i).getSexoCliente().toString();
            clienTemp[6] = clienList.get(i).getDataNascCliente().toString();
            clienTemp[7] = clienList.get(i).getEmailCliente();
            clienTemp[8] = clienList.get(i).getTelefoneCliente();
            clienTemp[9] = clienList.get(i).getCelularCliente();
            clienTemp[10] = clienList.get(i).getRuaCliente();
            clienTemp[11] = clienList.get(i).getCepCliente();
            clienTemp[12] = clienList.get(i).getComplementoCliente();
            clienTemp[13] = clienList.get(i).getBairroCliente();
            clienTemp[14] = clienList.get(i).getCidadeCliente();
            clienTemp[15] = clienList.get(i).getUfCliente();

            clientes.add(clienTemp);
        }
        return clientes;
    }

    public static String[] pegarCliente(int id) throws SQLException {

        Cliente client = new ClienteDAO().retornaCliente(id);

        String clienTemp[] = new String[16];

        clienTemp[0] = Integer.toString(client.getId());
        clienTemp[1] = client.getNomeCliente();
        clienTemp[2] = client.getRgCliente();
        clienTemp[3] = client.getCpfCliente();
        clienTemp[4] = client.getEstadoCivilCliente().toString();
        clienTemp[5] = client.getSexoCliente().toString();
        clienTemp[6] = client.getDataNascCliente().toString();
        clienTemp[7] = client.getEmailCliente();
        clienTemp[8] = client.getTelefoneCliente();
        clienTemp[9] = client.getCelularCliente();
        clienTemp[10] = client.getRuaCliente();
        clienTemp[11] = client.getCepCliente();
        clienTemp[12] = client.getComplementoCliente();
        clienTemp[13] = client.getBairroCliente();
        clienTemp[14] = client.getCidadeCliente();
        clienTemp[15] = client.getUfCliente();

        return clienTemp;
    }

    public static List<String[]> lerCliente() throws SQLException {

        List<String[]> clientes = new ArrayList<>();

        List<Cliente> clienList = new ClienteDAO().readCliente();

        for (int i = 0; i < clienList.size(); i++) {

            String clienTemp[] = new String[16];

            clienTemp[0] = Integer.toString(clienList.get(i).getId());
            clienTemp[1] = clienList.get(i).getNomeCliente();
            clienTemp[2] = clienList.get(i).getRgCliente();
            clienTemp[3] = clienList.get(i).getCpfCliente();
            clienTemp[4] = clienList.get(i).getEstadoCivilCliente().toString();
            clienTemp[5] = clienList.get(i).getSexoCliente().toString();
            clienTemp[6] = clienList.get(i).getDataNascCliente().toString();
            clienTemp[7] = clienList.get(i).getEmailCliente();
            clienTemp[8] = clienList.get(i).getTelefoneCliente();
            clienTemp[9] = clienList.get(i).getCelularCliente();
            clienTemp[10] = clienList.get(i).getRuaCliente();
            clienTemp[11] = clienList.get(i).getCepCliente();
            clienTemp[12] = clienList.get(i).getComplementoCliente();
            clienTemp[13] = clienList.get(i).getBairroCliente();
            clienTemp[14] = clienList.get(i).getCidadeCliente();
            clienTemp[15] = clienList.get(i).getUfCliente();

            clientes.add(clienTemp);
        }
        return clientes;
    }

    public static List<String> returnClienteID() throws SQLException {

        List<String> clientes = new ArrayList<>();

        List<Cliente> clientList = new ClienteDAO().readCliente();

        for (int i = 0; i < clientList.size(); i++) {
            String clientNames;

            clientNames = Integer.toString(clientList.get(i).getId());

            clientes.add(clientNames);
        }
        return clientes;
    }

    //Atualiza o Cliente recebendo os dados da tabela na view
    public static void atualizarCliente(int id, String nome, String rg, String cpf, String estadoCivil, String sexo,
            Date dataNasc, String email, String telefone, String celular, String rua, String cep,
            String complemento, String bairro, String cidade, String uf) throws SQLException {

        Cliente cliente = new Cliente();

        cliente.setId(id);
        cliente.setNomeCliente(nome);
        cliente.setRgCliente(rg);
        cliente.setCpfCliente(cpf);
        cliente.setEstadoCivilCliente(EstadoCivil.valueOf(estadoCivil));
        cliente.setSexoCliente(Sexo.valueOf(sexo));
        cliente.setDataNascCliente(dataNasc);
        cliente.setEmailCliente(email);
        cliente.setTelefoneCliente(telefone);
        cliente.setCelularCliente(celular);
        cliente.setRuaCliente(rua);
        cliente.setCepCliente(cep);
        cliente.setComplementoCliente(complemento);
        cliente.setBairroCliente(bairro);
        cliente.setCidadeCliente(cidade);
        cliente.setUfCliente(uf);

        ClientePersistence dao = new ClienteDAO();

        dao.updateCliente(cliente);
    }

    //Recebe o ID da interface e Acessa a persistencia e apaga o registro
    public static void apagarCliente(int id) throws SQLException {

        Cliente clien = new Cliente();
        clien.setId(id);
        ClientePersistence dao = new ClienteDAO();
        dao.deleteCliente(clien);

    }

}
