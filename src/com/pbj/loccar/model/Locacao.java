/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import java.util.Date;

/**
 *
 * @author lucas
 */
public class Locacao {
    private int id;
    private String valor;
    private String descricao;
    private int quantidade_de_dias; 
    private Cliente cliente;
    private Veiculo veiculo;
    private Date data_do_aluquel;
    private Date data_da_devolucao;
    private double valor_diaria;
    private double sub_total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade_de_dias() {
        return quantidade_de_dias;
    }

    public void setQuantidade_de_dias(int quantidade_de_dias) {
        this.quantidade_de_dias = quantidade_de_dias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Date getData_do_aluquel() {
        return data_do_aluquel;
    }

    public void setData_do_aluquel(Date data_do_aluquel) {
        this.data_do_aluquel = data_do_aluquel;
    }

    public Date getData_da_devolucao() {
        return data_da_devolucao;
    }

    public void setData_da_devolucao(Date data_da_devolucao) {
        this.data_da_devolucao = data_da_devolucao;
    }

    public double getValor_diaria() {
        return valor_diaria;
    }

    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }

    public double getSub_total() {
        return sub_total;
    }

    public void setSub_total(double sub_total) {
        this.sub_total = sub_total;
    }
    
    
    public static void LocacaoDoVeiculo(){
        
    }
}
