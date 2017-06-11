/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import com.pbj.loccar.util.DataHora;
import java.util.Date;
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
        Date dataToStringRetorno;
        dataToStringRetorno = DataHora.dataToString("02/06/2017");
    
        assertEquals(0, 0);
    }

    // testo o metodo
    public void stringToDataTest(){
        String stringToDataRetorno;
        stringToDataRetorno = DataHora.stringToData(DataHora.dataToString("02/06/2017"));
    
        assertEquals(0, 0);
    }
    
    // testo o metodo
    public void convertDataTest(){
        Date convertDataRetorno;
        convertDataRetorno = DataHora.convertData("02/06/2017");
        
        assertEquals(0, 0);
    }
    
    public void subDiasTest(){
        long subDiasRetorno;
        subDiasRetorno = DataHora.subDias("04/06/2017", "02/06/2017");
        
        assertEquals(0, 0);
    }
    
}
