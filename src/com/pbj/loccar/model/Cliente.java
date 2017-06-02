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
 * 
 * Classe que define as Informações do Cliente
 * 
 */

public class Cliente {
    
    private static int iterador;
    
    private int id;
    private String nomeCliente;
    private String rgCliente;
    private String cpfCliente;
    private EstadoCivil estadoCivilCliente; //S (solteiro), C (casado), V (viúvo), UE (União Estável), D (divorciado) 
    private Sexo sexoCliente; // M (masculino),  F (feminino)
    private Calendar dataNascCliente;
    private String emailCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String ruaCliente;
    private int cepCliente;
    private String complementoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String ufCliente;
    
    
    
    //Construtor Vazio 
    public Cliente(){
        iterador++;
        id = iterador;
    
    }
        
    //Construtor recebendo nome, cpf  e rg
    public Cliente(String nomeCliente,String rgCliente,String cpfCliente){
        iterador++;
        id = iterador;
        this.nomeCliente = nomeCliente;
        this.rgCliente = rgCliente;
        this.cpfCliente = cpfCliente;
       
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Calendar getDataNascCliente() {
        return dataNascCliente;
    }

    public void setDataNascCliente(Calendar dataNascCliente) {
        this.dataNascCliente = dataNascCliente;
    }

    public EstadoCivil getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(EstadoCivil estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }

    public Sexo getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(Sexo sexoCliente) {
        this.sexoCliente = sexoCliente;
    }


    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getRuaCliente() {
        return ruaCliente;
    }

    public void setRuaCliente(String ruaCliente) {
        this.ruaCliente = ruaCliente;
    }

    public int getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(int cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getComplementoCliente() {
        return complementoCliente;
    }

    public void setComplementoCliente(String complementoCliente) {
        this.complementoCliente = complementoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

 
  
       @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.nomeCliente);
        hash = 37 * hash + Objects.hashCode(this.cpfCliente);
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
            return false;
        }
        return Objects.equals(this.cpfCliente, other.cpfCliente);
    }

 
    
    
    @Override//Metodo toString
    public String toString() {
        return "Cliente{" + "id=" + id + ", nomeCliente=" + nomeCliente + 
                ", rgCliente=" + rgCliente + ", cpfCliente=" + cpfCliente +
                ", estadoCivilCliente=" + estadoCivilCliente + ", sexoCliente=" + sexoCliente +
                ", dataNascimentoCliente=" + dataNascCliente + ", emailCliente=" + emailCliente +
                ", telefoneCliente=" + telefoneCliente + ", celularCliente=" + celularCliente +
                ", ruaCliente=" + ruaCliente + ", cepCliente=" + cepCliente +
                ", complementoCliente=" + complementoCliente + ", bairroCliente=" + bairroCliente + 
                ", cidadeCliente=" + cidadeCliente + ", ufCliente=" + ufCliente + '}';
    }


}
