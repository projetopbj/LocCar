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
public class Locadora {
    private int id;
    private String descricao;
    private int qtdDias;
    private Date dataDoAluquel;
    private Date dataDaDevolucao;
    private double valorDiaria;
    private double subTotal;
    private boolean atrasoLocacao;
    private int diasAtraso;
    private Date dataRetorno;
    private double valorFinal;
    private Cliente idClientel; // chave estrangeira para o cliente
    private Veiculo idVeiculo; // chave estrangeira para o veículo

    public Veiculo getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Veiculo idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataDoAluquel() {
        return dataDoAluquel;
    }

    public void setDataDoAluquel(Date dataDoAluquel) {
        this.dataDoAluquel = dataDoAluquel;
    }

    public Date getDataDaDevolucao() {
        return dataDaDevolucao;
    }

    public void setDataDaDevolucao(Date dataDaDevolucao) {
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

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public Cliente getIdClientel() {
        return idClientel;
    }

    public void setIdClientel(Cliente idClientel) {
        this.idClientel = idClientel;
    }


    @Override
    public String toString() {
        return "Locadora{" + "id=" + id + ", descricao=" + descricao + ", qtdDias=" + qtdDias + ", dataDoAluquel=" + dataDoAluquel + ", dataDaDevolucao=" + dataDaDevolucao + ", valorDiaria=" + valorDiaria + ", subTotal=" + subTotal + ", atrasoLocacao=" + atrasoLocacao + ", diasAtraso=" + diasAtraso + ", dataRetorno=" + dataRetorno + ", valorFinal=" + valorFinal + ", idClientel=" + idClientel + ", idVeiculo=" + idVeiculo + '}';
    }
    
    
    public Locadora(int id){
    
    }
    
    public Locadora(int id,String descricao){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao,int diasAtraso){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao,int diasAtraso,Date dataRetorno){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao,int diasAtraso,Date dataRetorno,double valorFinal){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao,int diasAtraso,Date dataRetorno,double valorFinal,Cliente idClientel){
    
    }
    
    public Locadora(int id, String descricao,int qtdDias,Date dataDoAluquel,Date dataDaDevolucao,double valorDiaria,double subTotal,boolean atrasoLocacao,int diasAtraso,Date dataRetorno,double valorFinal,Cliente idClientel,Veiculo idVeiculo){
    
    }
    
    
    
    
    public static void Cadastro(){
    
    }
    
    public static void Listar(){
    
    }
    
    public static void Alterar(){
    
    }
}
