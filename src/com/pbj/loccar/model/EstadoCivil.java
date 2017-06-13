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
public enum EstadoCivil {

    S("Solteiro"),
    C("Casado"),
    V("Viúvo"),
    UE("União Estável"),
    D("divorciado");

    private final String desc;

    private EstadoCivil(String desc) {
        this.desc = desc;
    }

}
