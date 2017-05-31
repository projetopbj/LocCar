/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

/**
 *
 * @author lucas
 */
public class Usuario {
    private int id;
    private String loginUser;
    private String senhaUser;
    private String nomeUser;
    private String acessoUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUser) {
        this.senhaUser = senhaUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getAcessoUser() {
        return acessoUser;
    }

    public void setAcessoUser(String acessoUser) {
        this.acessoUser = acessoUser;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", loginUser=" + loginUser + ", senhaUser=" + senhaUser + ", nomeUser=" + nomeUser + ", acessoUser=" + acessoUser + '}';
    }
    
    public Usuario(int id){
    
    }
    
    public Usuario(int id,String loginUser){
    
    }
    
    public Usuario(int id,String loginUser,String senhaUser){
    
    }
    
    public Usuario(int id,String loginUser,String senhaUser,String nomeUser){
    
    }
    
    public Usuario(int id,String loginUser,String senhaUser,String nomeUser,String acessoUser){
    
    }
    
    
    
    
    public static void Cadastro(){
    
    }
    
    public static void Listar(){
    
    }
    
    public static void Alterar(){
    
    }
    
}
