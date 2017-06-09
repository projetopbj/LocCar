/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import com.pbj.loccar.util.DataHora;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author lucas
 * 
 * Classe que realiza a locação no banco de dados faz papel de relacionamento
 */
public class Locacao {
       
    private int id;
    private String descricao;
    private int qtdDias;
    private Date dataDoAluguel;
    private Date dataDaDevolucao;
    private boolean desconto; // Bolean que guarda se existe desconto;
    private double valorDesconto; // Valor final calculado do desconto que será guardado no banco
    private double subTotal;
    private boolean atrasoLocacao;
    private int diasAtraso;
    private Date dataRetorno;
    private double valorFinal;
    private boolean statusLocacao;


    private Cliente cliente; // chave estrangeira para o cliente
    private Veiculo veiculo; // chave estrangeira para o veículo
    
    
    //Construtor Vazio que apenas inicializa o ID
    public Locacao(){
        
      this.cliente = new Cliente();
      this.veiculo = new Veiculo();
      
      
      this.atrasoLocacao = false;
      this.diasAtraso = 0;
      valorFinal = 0.0;      
      this.dataRetorno = null;
        
        
        
    }
    //Construtor que Inicializa o ID e Já recebe os Clientes e Veiculo
    public Locacao(Cliente cliente, Veiculo veiculo){
        
        
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.atrasoLocacao = false;
        this.diasAtraso = 0;
        valorFinal = 0.0;      
        this.dataRetorno = null;
        
        
    }
    
    public boolean isStatusLocacao() {
        return statusLocacao;
    }
    
    public String getStatusLocacao() {
         if(this.statusLocacao){
             return "Finalizado";
         }else{
            return "Aberto";
         }
    }

    public void setStatusLocacao(boolean statusLocacao) {
        this.statusLocacao = statusLocacao;
    }
    
    public boolean isDesconto() {
        return desconto;
    }
    
     public String getDesconto() {
         if(this.desconto){
             return "Sim";
         }else{
            return "Não";
         }
    }

    public void setDesconto(boolean desconto) {
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

    public Date getDataDoAluguel() {
        return dataDoAluguel;
    }

    public void setDataDoAluguel(Date dataDoAluguel) {
        this.dataDoAluguel = dataDoAluguel;
    }

    public Date getDataDaDevolucao() {
        return dataDaDevolucao;
    }

    public void setDataDaDevolucao(Date dataDaDevolucao) {
        this.dataDaDevolucao = dataDaDevolucao;
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
    
    public String getAtrasoLocacao() {
         if(this.atrasoLocacao){
             return "Sim";
         }else{
            return "Não";
         }
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente idCliente) {
        this.cliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.cliente);
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
        final Locacao other = (Locacao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        return Objects.equals(this.veiculo, other.veiculo);
    }   

    
    
    
    public void alugar(int desconto){
        
        this.dataDaDevolucao = DataHora.somaDias(dataDoAluguel, qtdDias);
        this.statusLocacao = false;
        calculoDesconto(desconto);
        calculoSubTotal();

    }
    
    public void devolver(){
        calculoValorFinal();
        this.statusLocacao = true;
        this.dataRetorno = DataHora.somaDias(this.dataDaDevolucao, diasAtraso); 
    }

    //Calcula Desconto
    private void calculoDesconto(int desconto){
        
        //Se o desconto recebebido for maior que zero
        if (desconto > 0){
            this.desconto = true;
            //Pega o valor da diaria da categoria do veiculo e calcula com os dias e zas
            this.valorDesconto =(veiculo.getCategoria().getValorDia() * ((double)this.qtdDias) * ((double)desconto *0.01));
        }
        else{
            this.valorDesconto = 0.0;
           
        }
        
    }
    //Calcula SubTotal
    private void calculoSubTotal(){
        if (this.valorDesconto > 0.0) {
            this.subTotal = ( ( this.veiculo.getCategoria().getValorDia() * ((double)this.qtdDias) ) - this.valorDesconto);
           
        }
        else{
            this.subTotal = ( veiculo.getCategoria().getValorDia() * ((double)this.qtdDias) );
            
        }
    }
    //Calcula valor Final
    private void calculoValorFinal(){
        if(this.atrasoLocacao)
        {
            if(this.diasAtraso == 1){
                valorFinal = this.subTotal + veiculo.getCategoria().getValorKm();
            }else if(this.diasAtraso > 1){
                valorFinal = this.subTotal + (veiculo.getCategoria().getValorKm() * this.diasAtraso);
            }      
        }
        else{
            valorFinal = this.subTotal;
            
        }
    }
 
    @Override
    public String toString() {
        return "Locadora{" + "id=" + id + ", descricao=" + descricao + ", qtdDias=" + qtdDias + 
                ", dataDoAluquel=" + dataDoAluguel + ", dataDaDevolucao=" + dataDaDevolucao + 
                ", isDesconto=" + desconto + ", desconto=" + desconto + 
                ", valorDesconto=" + valorDesconto + ", subTotal=" + subTotal + ", atrasoLocacao=" + atrasoLocacao + 
                ", diasAtraso=" + diasAtraso + ", dataRetorno=" + dataRetorno + ", valorFinal=" + valorFinal + 
                ", clientel=" + cliente + ", veiculo=" + veiculo + '}';
    }
}
