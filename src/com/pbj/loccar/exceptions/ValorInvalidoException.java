/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.exceptions;

/**
 *
 * @author Akr-Taku
 */
public class ValorInvalidoException extends Exception{
    
    
    public ValorInvalidoException(String msg){
        super(msg);
    }
    public ValorInvalidoException(String msg, Throwable cause){
        super(msg, cause);
    }
    
    
}
