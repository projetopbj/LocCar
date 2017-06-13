/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import com.pbj.loccar.persistence.LocacaoPersistence;
import com.pbj.loccar.persistence.dao.ClienteDAO;
import com.pbj.loccar.persistence.dao.LocacaoDAO;
import com.pbj.loccar.persistence.dao.VeiculoDAO;
import java.sql.SQLException;
import java.text.ParseException;
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
public class LocacaoControl {

    //Salva a Locacao no Banco de dados
    public static void salvarLocacao(String descricao, Date dataDoAluguel, int qtdDias,
            int idCliente, int idVeiculo, boolean isDesconto, int desconto) throws SQLException {

        Cliente locate = new ClienteDAO().retornaCliente(idCliente);
        Veiculo veiculo = new VeiculoDAO().retornaVeiculo(idVeiculo);
        Locacao locacao = new Locacao(locate, veiculo);

        locacao.setDescricao(descricao);
        locacao.setDataDoAluguel(dataDoAluguel);
        locacao.setQtdDias(qtdDias);
        locacao.setDesconto(isDesconto);

        locacao.alugar(desconto);

        new LocacaoDAO().createLocacao(locacao);

    }

    /*
    Converte o retorno Lista de Locacao do DAO e Converte em Vetor de String 
    " # ",
    "Descrição",
    "Cliente",
    "Veiculo",
    "Placa",
    "Data Ida",
    "Dias",
    "Data Esperada",
    "Data Volta",
    "Desconto",
    "Valor do Desconto",
    "SubTotal",
    "Atraso",
    "Dias de Atraso"
    "Valor Final",
    "Status"
     */
    public static List<String[]> lerLocacao() throws SQLException {

        List<String[]> locacao = new ArrayList<>();

        List<Locacao> locaList = new LocacaoDAO().readLocacao();

        for (int i = 0; i < locaList.size(); i++) {

            String locaTemp[] = new String[16];

            locaTemp[0] = Integer.toString(locaList.get(i).getId());
            locaTemp[1] = locaList.get(i).getDescricao();
            locaTemp[2] = locaList.get(i).getCliente().getNomeCliente();
            locaTemp[3] = locaList.get(i).getVeiculo().getModelo();
            locaTemp[4] = locaList.get(i).getVeiculo().getPlaca();
            locaTemp[5] = locaList.get(i).getDataDoAluguel().toString();
            locaTemp[6] = Integer.toString(locaList.get(i).getQtdDias());
            locaTemp[7] = locaList.get(i).getDataDaDevolucao().toString();

            locaTemp[8] = locaList.get(i).getDataRetorno().toString();

            locaTemp[9] = locaList.get(i).getDesconto();

            locaTemp[10] = Double.toString(locaList.get(i).getValorDesconto());

            locaTemp[11] = Double.toString(locaList.get(i).getSubTotal());

            locaTemp[12] = locaList.get(i).getAtrasoLocacao();
            locaTemp[13] = Integer.toString(locaList.get(i).getDiasAtraso());
            locaTemp[14] = Double.toString(locaList.get(i).getValorFinal());
            locaTemp[15] = locaList.get(i).getStatusLocacao();

            locacao.add(locaTemp);
        }
        return locacao;
    }

    public static List<String[]> lerLocacao(boolean status) throws SQLException {

        List<String[]> locacao = new ArrayList<>();

        List<Locacao> locaList = new LocacaoDAO().readLocacao(status);

        for (int i = 0; i < locaList.size(); i++) {

            String locaTemp[] = new String[16];

            locaTemp[0] = Integer.toString(locaList.get(i).getId());
            locaTemp[1] = locaList.get(i).getDescricao();
            locaTemp[2] = locaList.get(i).getCliente().getNomeCliente();
            locaTemp[3] = locaList.get(i).getVeiculo().getModelo();
            locaTemp[4] = locaList.get(i).getVeiculo().getPlaca();
            locaTemp[5] = locaList.get(i).getDataDoAluguel().toString();
            locaTemp[6] = Integer.toString(locaList.get(i).getQtdDias());
            locaTemp[7] = locaList.get(i).getDataDaDevolucao().toString();

            locaTemp[8] = locaList.get(i).getDataRetorno().toString();

            locaTemp[9] = locaList.get(i).getDesconto();

            locaTemp[10] = Double.toString(locaList.get(i).getValorDesconto());

            locaTemp[11] = Double.toString(locaList.get(i).getSubTotal());

            locaTemp[12] = locaList.get(i).getAtrasoLocacao();
            locaTemp[13] = Integer.toString(locaList.get(i).getDiasAtraso());
            locaTemp[14] = Double.toString(locaList.get(i).getValorFinal());
            locaTemp[15] = locaList.get(i).getStatusLocacao();

            locacao.add(locaTemp);
        }
        return locacao;
    }

    public static List<String[]> lerLocacao(boolean status, String param) throws SQLException {

        List<String[]> locacao = new ArrayList<>();

        List<Locacao> locaList = new LocacaoDAO().readLocacao(status, param);

        for (int i = 0; i < locaList.size(); i++) {

            String locaTemp[] = new String[16];

            locaTemp[0] = Integer.toString(locaList.get(i).getId());
            locaTemp[1] = locaList.get(i).getDescricao();
            locaTemp[2] = locaList.get(i).getCliente().getNomeCliente();
            locaTemp[3] = locaList.get(i).getVeiculo().getModelo();
            locaTemp[4] = locaList.get(i).getVeiculo().getPlaca();
            locaTemp[5] = locaList.get(i).getDataDoAluguel().toString();
            locaTemp[6] = Integer.toString(locaList.get(i).getQtdDias());
            locaTemp[7] = locaList.get(i).getDataDaDevolucao().toString();

            locaTemp[8] = locaList.get(i).getDataRetorno().toString();

            locaTemp[9] = locaList.get(i).getDesconto();

            locaTemp[10] = Double.toString(locaList.get(i).getValorDesconto());

            locaTemp[11] = Double.toString(locaList.get(i).getSubTotal());

            locaTemp[12] = locaList.get(i).getAtrasoLocacao();
            locaTemp[13] = Integer.toString(locaList.get(i).getDiasAtraso());
            locaTemp[14] = Double.toString(locaList.get(i).getValorFinal());
            locaTemp[15] = locaList.get(i).getStatusLocacao();

            locacao.add(locaTemp);
        }
        return locacao;
    }

    public static List<String[]> lerLocacao(String param) throws SQLException {

        List<String[]> locacao = new ArrayList<>();

        List<Locacao> locaList = new LocacaoDAO().readLocacao(param);

        for (int i = 0; i < locaList.size(); i++) {

            String locaTemp[] = new String[16];

            locaTemp[0] = Integer.toString(locaList.get(i).getId());
            locaTemp[1] = locaList.get(i).getDescricao();
            locaTemp[2] = locaList.get(i).getCliente().getNomeCliente();
            locaTemp[3] = locaList.get(i).getVeiculo().getModelo();
            locaTemp[4] = locaList.get(i).getVeiculo().getPlaca();
            locaTemp[5] = locaList.get(i).getDataDoAluguel().toString();
            locaTemp[6] = Integer.toString(locaList.get(i).getQtdDias());
            locaTemp[7] = locaList.get(i).getDataDaDevolucao().toString();

            locaTemp[8] = locaList.get(i).getDataRetorno().toString();

            locaTemp[9] = locaList.get(i).getDesconto();

            locaTemp[10] = Double.toString(locaList.get(i).getValorDesconto());

            locaTemp[11] = Double.toString(locaList.get(i).getSubTotal());

            locaTemp[12] = locaList.get(i).getAtrasoLocacao();
            locaTemp[13] = Integer.toString(locaList.get(i).getDiasAtraso());
            locaTemp[14] = Double.toString(locaList.get(i).getValorFinal());
            locaTemp[15] = locaList.get(i).getStatusLocacao();

            locacao.add(locaTemp);
        }
        return locacao;
    }

    public static String[] pegaLocacao(int id) throws SQLException {

        Locacao locaList = new LocacaoDAO().retornaLocacao(id);

        String locaTemp[] = new String[14];

        locaTemp[0] = Integer.toString(locaList.getId());
        locaTemp[1] = locaList.getDescricao();

        locaTemp[2] = locaList.getCliente().getNomeCliente();
        locaTemp[3] = locaList.getCliente().getCpfCliente();

        locaTemp[4] = locaList.getVeiculo().getModelo();
        locaTemp[5] = locaList.getVeiculo().getPlaca();
        locaTemp[6] = locaList.getVeiculo().getCategoria().getNome();
        locaTemp[7] = Double.toString(locaList.getVeiculo().getCategoria().getValorDia());
        locaTemp[8] = Double.toString(locaList.getVeiculo().getCategoria().getValorKm());

        locaTemp[9] = locaList.getDataDoAluguel().toString();
        locaTemp[10] = Integer.toString(locaList.getQtdDias());
        locaTemp[11] = locaList.getDataDaDevolucao().toString();
        locaTemp[12] = Double.toString(locaList.getValorDesconto());
        locaTemp[13] = Double.toString(locaList.getSubTotal());

        return locaTemp;

    }

    //Atualiza A Locacao não finalizada recebendo os dados da tabela na view
    public static void atualizarLocacao(int id, String descricao, Date dataDoAluguel, int qtdDias,
            int idCliente, int idVeiculo, boolean isDesconto, int desconto) throws SQLException {

        Cliente locate = new ClienteDAO().retornaCliente(idCliente);
        Veiculo veiculo = new VeiculoDAO().retornaVeiculo(idVeiculo);
        Locacao locacao = new Locacao(locate, veiculo);

        locacao.setId(id);
        locacao.setDescricao(descricao);
        locacao.setDataDoAluguel(dataDoAluguel);
        locacao.setQtdDias(qtdDias);
        locacao.setDesconto(isDesconto);
        locacao.alugar(desconto);

        new LocacaoDAO().createLocacao(locacao);

    }

    public static void encerraLocacao(int id, int diasAtraso) throws SQLException {

        Locacao locacao = new LocacaoDAO().retornaLocacao(id);

        if (diasAtraso > 0) {
            locacao.setAtrasoLocacao(true);
            locacao.setDiasAtraso(diasAtraso);
        } else {
            locacao.setAtrasoLocacao(false);
            locacao.setDiasAtraso(0);
        }

        locacao.devolver();

        new LocacaoDAO().closeLocacao(locacao);

    }

    //Recebe o ID da interface e Acessa a persistencia e apaga o registro
    public static void apagarLocacao(int id) throws SQLException, ParseException {

        Locacao loc = new Locacao();
        loc.setId(id);
        LocacaoPersistence dao = new LocacaoDAO();
        dao.deleteLocacao(loc);
    }

}
