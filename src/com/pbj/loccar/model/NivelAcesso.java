/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

/**
 *
 * @author Akr-Taku
 */
public enum NivelAcesso {
    
    Admin("Administrador do Sistema"),
    parceiro("Usuario Parceiro");
    
    private final String desc;
    
    private NivelAcesso(String desc){
        this.desc = desc;
    }
    
}
