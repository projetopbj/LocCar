/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author lucas
 * 
 * Classe que realiza a locação no banco de dados faz papel de relacionamento
 */
public class Locadora {
    
    private static int iterador; //Variavel statica para iterar;

    
    private int id;
    private String descricao;
    private int qtdDias;
    private Calendar dataDoAluquel;
    private Calendar dataDaDevolucao;
    private double valorDiaria;
    private boolean isDesconto; // Bolean que guarda se existe desconto;
    private int desconto;    // Valor em Porcentagem que não será guardado no Banco de dados
    private double valorDesconto; // Valor final calculado do desconto que será guardado no banco
    private double subTotal;
    private boolean atrasoLocacao;
    private int diasAtraso;
    private Calendar dataRetorno;
    private double valorFinal;
    private Cliente clientel; // chave estrangeira para o cliente
    private Veiculo veiculo; // chave estrangeira para o veículo
    
    
    //Construtor Vazio que apenas inicializa o ID
    public Locadora(){
        
        iterador++;
        id = iterador;
        
        
    }
    //Construtor que Inicializa o ID e Já recebe os Clientes e Veiculo
    public Locadora(Cliente cliente, Veiculo veiculo){
        
        iterador++;
        id = iterador;
        
        this.veiculo = veiculo;
        this.clientel = cliente;
    }

    public boolean isIsDesconto() {
        return isDesconto;
    }

    public void setIsDesconto(boolean isDesconto) {
        this.isDesconto = isDesconto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo idVeiculo) {
        this.veiculo = idVeiculo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Calendar getDataDoAluquel() {
        return dataDoAluquel;
    }

    public void setDataDoAluquel(Calendar dataDoAluquel) {
        this.dataDoAluquel = dataDoAluquel;
    }

    public Calendar getDataDaDevolucao() {
        return dataDaDevolucao;
    }

    public void setDataDaDevolucao(Calendar dataDaDevolucao) {
        this.dataDaDevolucao = dataDaDevolucao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public boolean isAtrasoLocacao() {
        return atrasoLocacao;
    }

    public void setAtrasoLocacao(boolean atrasoLocacao) {
        this.atrasoLocacao = atrasoLocacao;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public Calendar getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Calendar dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Cliente getClientel() {
        return clientel;
    }

    public void setClientel(Cliente idClientel) {
        this.clientel = idClientel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.clientel);
        hash = 17 * hash + Objects.hashCode(this.veiculo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Locadora other = (Locadora) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.clientel, other.clientel)) {
            return false;
        }
        return Objects.equals(this.veiculo, other.veiculo);
    }   

    @Override
    public String toString() {
        return "Locadora{" + "id=" + id + ", descricao=" + descricao + ", qtdDias=" + qtdDias + 
                ", dataDoAluquel=" + dataDoAluquel + ", dataDaDevolucao=" + dataDaDevolucao + 
                ", valorDiaria=" + valorDiaria + ", isDesconto=" + isDesconto + ", desconto=" + desconto + 
                ", valorDesconto=" + valorDesconto + ", subTotal=" + subTotal + ", atrasoLocacao=" + atrasoLocacao + 
                ", diasAtraso=" + diasAtraso + ", dataRetorno=" + dataRetorno + ", valorFinal=" + valorFinal + 
                ", clientel=" + clientel + ", veiculo=" + veiculo + '}';
    }
    
    public double calculoDesconto(){
        if (isDesconto) {
            this.valorDesconto = ((this.valorDiaria * (double)this.qtdDias) * ((double)this.desconto *0.01));
            return this.valorDesconto;
        }
        else{
            this.valorDesconto = 0.0;
            return this.valorDesconto;
        }
        
    }
    
    public double calculoSubTotal(Locadora loc){
        if (isDesconto) {
            this.subTotal = (this.valorDiaria * (double)this.qtdDias) - loc.calculoDesconto();
            return this.subTotal;
        }
        else{
            this.subTotal = (this.valorDiaria * (double)this.qtdDias);
            return this.subTotal;
        }
    }
    
    public double calculoValorFinal(Locadora loc){
        if(this.atrasoLocacao){
            if (isDesconto) {
                this.valorFinal = this.subTotal + ((this.diasAtraso * this.valorDiaria) - loc.calculoDesconto());
                return this.valorFinal;
            }
            else{
                this.valorFinal = this.subTotal + (this.diasAtraso * this.valorDiaria);
                return this.valorFinal;
            }
            
        }
        else{
            this.valorFinal = this.subTotal;
            return this.valorFinal;
        }
    }
 
    
}
