/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.model;

/**
 *
 * @author Aleff
 */
//Classe utilitaria inerente ao pacote Model que gera um autoincremento.
public class Iterador {
    
    
    //Construtor privado para que não seja instanciado;
    private Iterador(){      
    }
    
    /**
     *
     * @param iterador
     * @param id
     * 
     * metodo que recebe os valores a serem iterados
     */
    public static void iterar(int iterador, int id){
        iterador++;
        id = iterador;
        
    }
    
}
