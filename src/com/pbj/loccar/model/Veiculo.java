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
 */
public class Veiculo {
    
    private static int iterador; //Variavel statica para iterar;
    
    private int id;
    
    private String placa; 
    private String modelo;// modelo do veículo Gol, Siena, Palio, etc.
    private String marca;
    private String chassi; 
    private int  ano; // ano de fabricação do veículo
    private int nPortas;
    private String cor;
    private Categoria categoria;
    private boolean alugado;
    
    
    public Veiculo(){
        
        id = iterador++;
       
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAlugado() {
        return alugado;
    }
    public String getAlugado() {
       if(this.alugado == true){
           return "Alugado";
       }else{
           return "Disponivel";
       }
    }
    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.placa);
        hash = 53 * hash + Objects.hashCode(this.chassi);
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
        final Veiculo other = (Veiculo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        if (!Objects.equals(this.chassi, other.chassi)) {
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public String toString() {
        return "Veiculo{" + "id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", chassi=" + chassi + ", ano=" + ano + ", nPortas=" + nPortas + ", cor=" + cor + ", alugado=" + alugado + '}';
    }

 
    
}
