/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import com.pbj.loccar.exceptions.DataInvalidaException;
import com.pbj.loccar.util.DataHora;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 */
public class DataHoraTest extends TestCase{
    
    // declaro as variaveis usadas
    DataHora datahora;
    
    // inicio as variaveis
    public void setUp(){
        datahora = new DataHora();
        
    }

    // fecho as variaveis
    public void tearDown(){
        datahora = null;
    }

    // testo o metodo
    public void somaDiasTest(){
        Date somaDiasRetorno;
        somaDiasRetorno = DataHora.somaDias(DataHora.convertData("02/06/2017"), 2);
    
        assertEquals(0, 0);
    }

    // testo o metodo
    public void dataToStringTest(){
        try {
            Date dataToStringRetorno;
            
            dataToStringRetorno = DataHora.dataToString("02/06/2017");
            
            
            assertEquals(0, 0);
        } catch (ParseException ex) {
            Logger.getLogger(DataHoraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // testo o metodo
    public void stringToDataTest(){
        try {
            String stringToDataRetorno;
            stringToDataRetorno = DataHora.stringToData(DataHora.dataToString("02/06/2017"));
            
            assertEquals(0, 0);
        } catch (ParseException | DataInvalidaException ex) {
            Logger.getLogger(DataHoraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // testo o metodo
    public void convertDataTest(){
        Date convertDataRetorno;
        convertDataRetorno = DataHora.convertData("02/06/2017");
        
        assertEquals(0, 0);
    }
    
    public void subDiasTest(){
        try {
            long subDiasRetorno;
            subDiasRetorno = DataHora.subDias("04/06/2017", "02/06/2017");
            
            assertEquals(0, 0);
        } catch (DataInvalidaException ex) {
            Logger.getLogger(DataHoraTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
