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
public class Usuario {

    private static int iterador; //Variavel statica para iterar;

    private int id;
    private String loginUser;
    private String senhaUser;
    private String nomeUser;
    private String acessoUser;

    public Usuario() {

        iterador++;
        id = iterador;

    }

    /**
     *
     * @param login
     * @param nome
     * @param acesso
     */
    public Usuario(String login, String nome, String acesso) {

        iterador++;
        id = iterador;

        this.loginUser = login;
        this.nomeUser = nome;
        this.acessoUser = acesso;

    }

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
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.loginUser);
        hash = 89 * hash + Objects.hashCode(this.acessoUser);
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.loginUser, other.loginUser)) {
            return false;
        }
        return this.acessoUser.equals(other.acessoUser);
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", loginUser=" + loginUser + ", senhaUser=" + senhaUser + ", nomeUser=" + nomeUser + ", acessoUser=" + acessoUser + '}';
    }

}
