/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * Classe util com metodos staticos referentes a data e hora.
 */
public class DataHora{

    //Método statico que captura Data atual e returna como uma String
    public static String getData(){
        
        Date SystemDate = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormat.format(SystemDate);
    }
    
    
    
    /**
     *
     * @return 
     * 
     * Método que retorna a hora Atual
     * 
     * Usado na view em uma thread para que a hora seja atualizada em tempo real
     * 
     */
   public static String getHora(){
       
            Calendar hora = new GregorianCalendar();          
            int   hh = hora.get(Calendar.HOUR_OF_DAY);
            int   mm = hora.get(Calendar.MINUTE);
            int   ss = hora.get(Calendar.SECOND);      
            String horaAgora = hh + ":" + mm + ":" + ss;      
            return horaAgora;     
            
    }

}


    
    

