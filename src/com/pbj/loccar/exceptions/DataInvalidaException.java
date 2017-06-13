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
public class DataInvalidaException extends Exception{

    public DataInvalidaException(String message) {
        super(message);
    }
    public DataInvalidaException(String msg, Throwable cause){
        super(msg, cause);
    }    
    
}
