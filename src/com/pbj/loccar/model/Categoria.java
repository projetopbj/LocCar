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
    public Categoria() {

        id = iterador++;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAr() {
        return this.ar;
    }

    public String getAr() {
        if (this.ar == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setAr(boolean ar) {
        this.ar = ar;
    }

    public boolean isVidro() {
        return vidro;
    }

    public String getVidro() {
        if (this.vidro == true) {
            return "Sim";
        } else {
            return "Não";
        }
    }

    public void setVidro(boolean vidro) {
        this.vidro = vidro;
    }

    public boolean isDirecao() {
        return direcao;
    }

    public String getDirecao() {
        if (this.direcao == true) {
            return "Sim";
        } else {
            return "Não";
        }
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
