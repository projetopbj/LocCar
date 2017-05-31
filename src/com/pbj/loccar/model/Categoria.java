/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

import java.math.BigDecimal;

/**
 *
 * @author lucas
 */
public class Categoria {
    
    private int id;
    private String nome;
    private BigDecimal valorDia;
    private BigDecimal valorKm;
    private boolean ar;
    private boolean vidro;
    private boolean direcao;

    
    
    //Contrutor vazio;
    public Categoria() {
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

    public BigDecimal getValorDia() {
        return valorDia;
    }

    public void setValorDia(BigDecimal valorDia) {
        this.valorDia = valorDia;
    }

    public BigDecimal getValorKm() {
        return valorKm;
    }

    public void setValorKm(BigDecimal valorKm) {
        this.valorKm = valorKm;
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
    
    
  


 
}
