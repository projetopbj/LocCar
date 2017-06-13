/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import com.pbj.loccar.util.DataHora;
import java.util.Date;

/**
 *
 * @author lucas
 */
public class principal {
    static void main(String arg[]){
        Date somaDiasRetorno;
        somaDiasRetorno = DataHora.somaDias(DataHora.convertData("02/06/2017"), 2);
        System.out.println("somaDiasRetorno: " + somaDiasRetorno);
        Date dataToStringRetorno;
        dataToStringRetorno = DataHora.dataToString("02/06/2017");
        System.out.println("dataToStringRetorno: " + dataToStringRetorno);
        String stringToDataRetorno;
        stringToDataRetorno = DataHora.stringToData(DataHora.dataToString("02/06/2017"));
        System.out.println("stringToDataRetorno: " + stringToDataRetorno);
        Date convertDataRetorno;
        convertDataRetorno = DataHora.convertData("02/06/2017");
        System.out.println("convertDataRetorno: " + convertDataRetorno);
        long subDiasRetorno;
        subDiasRetorno = DataHora.subDias("04/06/2017", "06/06/2017");
        
        System.out.println("subDiasRetorno: " + subDiasRetorno);
    }
}
