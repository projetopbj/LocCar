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
public class RegistroSeguro {
    private int id;
    private int cliente_id;
    private int veiculo_id;
    private int seguro_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getVeiculo_id() {
        return veiculo_id;
    }

    public void setVeiculo_id(int veiculo_id) {
        this.veiculo_id = veiculo_id;
    }

    public int getSeguro_id() {
        return seguro_id;
    }

    public void setSeguro_id(int seguro_id) {
        this.seguro_id = seguro_id;
    }
    
    
}
