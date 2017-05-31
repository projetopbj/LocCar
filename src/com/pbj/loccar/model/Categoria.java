/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import java.util.Objects;

/**
 *
 * @author lucas
 * 
 * Classe de Categoria que vai ser usado com composição da classe veiculo;
 */
public class Categoria {
    
    private static int iterador; //Variavel statica para iterar;
    
    private int id;
    private String nome;
    private boolean ar;
    private boolean vidro;
    private boolean direcao;
    private double valorDia;
    private double valorKm;
    
    /*
    *
    * Varias SobreCargas de Construtores
    * Cada um recebe algo diferente.
    */
    
    
    
    public Categoria(){
           
           Iterador.iterar(iterador,id);
    }

    public Categoria(String nome){
        
        Iterador.iterar(iterador,id);
        this.nome = nome;
        
    }
     
    public Categoria(String nome,boolean ar,boolean vidro,boolean direcao,double valorDia,double valorKm ){
        Iterador.iterar(iterador,id);
        this.nome = nome;
        this.ar = ar;
        this.vidro = vidro;
        this.direcao = direcao;
        this.valorDia = valorDia;
        this.valorKm = valorKm;
        
    }
    
    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAr() {
        return ar;
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isVidro() {
        return vidro;
    }

    public void setVidro(boolean vidro) {
        this.vidro = vidro;
    }

    public boolean isDirecao() {
        return direcao;
    }

    public void setDirecao(boolean direcao) {
        this.direcao = direcao;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public double getValorKm() {
        return valorKm;
    }

    public void setValorKm(double valorKm) {
        this.valorKm = valorKm;
    }



    @Override //HashCode
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override//Equals
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
        final Categoria other = (Categoria) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    
    
        @Override//ToString
    public String toString() {
        return "Categoria{" + "id=" + id + ", nome=" + nome + ", ar=" + ar + ", vidro=" + vidro + ", direcao=" + direcao + ", valorDia=" + valorDia + ", valorKm=" + valorKm + '}';
    }

}
