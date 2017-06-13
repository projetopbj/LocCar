/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

/**
 *
 * @author Akr-Taku
 *
 * Enum que define o Sexo usado no cliente
 */
public enum Sexo {

    M("Masculino"),
    F("Feminino");

    private final String desc;

    private Sexo(String desc) {

        this.desc = desc;

    }

}
