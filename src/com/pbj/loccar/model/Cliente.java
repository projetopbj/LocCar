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
public class Cliente {
    
    private int id;
    private String nomeCliente;
    private String rgCliente;
    private String cpfCliente;
    private String estadoCivilCliente; //S (solteiro), C (casado), V (viúvo), UE (União Estável), D (divorciado) 
    private String sexoCliente; // M (masculino),  F (feminino)
    private Date data_nascimentoCliente;
    private String emailCliente;
    private String telefoneCliente;
    private String celularCliente;
    private String ruaCliente;
    private int cepCliente;
    private String complementoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String ufCliente;

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

    public String getEstadoCivilCliente() {
        return estadoCivilCliente;
    }

    public void setEstadoCivilCliente(String estadoCivilCliente) {
        this.estadoCivilCliente = estadoCivilCliente;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public Date getData_nascimentoCliente() {
        return data_nascimentoCliente;
    }

    public void setData_nascimentoCliente(Date data_nascimentoCliente) {
        this.data_nascimentoCliente = data_nascimentoCliente;
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
    public String toString() {
        return "Cliente{" + "id=" + id + ", nomeCliente=" + nomeCliente + ", rgCliente=" + rgCliente + ", cpfCliente=" + cpfCliente + ", estadoCivilCliente=" + estadoCivilCliente + ", sexoCliente=" + sexoCliente + ", data_nascimentoCliente=" + data_nascimentoCliente + ", emailCliente=" + emailCliente + ", telefoneCliente=" + telefoneCliente + ", celularCliente=" + celularCliente + ", ruaCliente=" + ruaCliente + ", cepCliente=" + cepCliente + ", complementoCliente=" + complementoCliente + ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente + ", ufCliente=" + ufCliente + '}';
    }
    
    
    public Cliente(int id){
    
    }
    
    public Cliente(int id,String nomeCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente,int cepCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente,int cepCliente,String complementoCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente,int cepCliente,String complementoCliente,String bairroCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente,int cepCliente,String complementoCliente,String bairroCliente,String cidadeCliente){
    
    }
    
    public Cliente(int id,String nomeCliente,String rgCliente,String cpfCliente,String estadoCivilCliente,String sexoCliente,Date data_nascimentoCliente,String emailCliente, String telefoneCliente,String celularCliente,String ruaCliente,int cepCliente,String complementoCliente,String bairroCliente,String cidadeCliente,String ufCliente){
    
    }
    
    
    
    
    
    
    public static void Cadastro(){
    
    }
    
    public static void Listar(){
    
    }
    
    public static void Alterar(){
    
    }
}
