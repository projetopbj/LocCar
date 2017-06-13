/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.util;

import com.pbj.loccar.exceptions.DataInvalidaException;
import com.pbj.loccar.exceptions.ValorInvalidoException;
import com.pbj.loccar.view.JFrameCadastroCliente;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * Classe util com metodos staticos referentes a data e hora.
 */
public class DataHora{
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
    //Método statico que captura Data atual e returna como uma String
    public static String getData(){
        
        Date SystemDate = new Date();
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormat.format(SystemDate);
    }
   //Recebe um date e um int e retorna um date com os dias contados
    public static Date somaDias(Date data, int dias) {
	Calendar cal = new GregorianCalendar();
	cal.setTime(data);
	cal.add(Calendar.DAY_OF_MONTH, dias);
	return cal.getTime();
    }
    
    public static String somaDias(String data, String diaS) throws ValorInvalidoException, DataInvalidaException, ParseException {
        
        
        Date date = dataToString(data);
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        int dias = Integer.parseInt(diaS);  
                
        
        
        if(dias < 0){
            throw new ValorInvalidoException("O valor passado é menor que Zero");
        }
	cal.add(Calendar.DAY_OF_MONTH, dias);
           return stringToData(cal.getTime());
       
    }
    
    public static long subDias(String dataDev, String dataHoje) throws DataInvalidaException {
        try{
        Date dateD = dataToString(dataDev);
        Date dateH = dataToString(dataHoje);
        
	long dias = (dateH.getTime() - dateD.getTime()) + 3600000;
        
        dias = dias  / 86400000L;

	return dias;
        }catch(Exception e){
            throw new DataInvalidaException("O um dos Valores inseridos não é válido!: ", e);
        }
    }
    
    
        //Recebe uma String dd/MM/yyyy e converte para String
    public static  Date dataToString(String data) throws ParseException{
           DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
           
                Date dataRetorno = (Date)formatter.parse(data);
                
                return dataRetorno;
          
              
    }
   
      //Recebe uma data e converte para String no formato dd/MM/yyyy
    public static  String stringToData(Date data) throws DataInvalidaException{
           DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
           String dataRetorno = null;
           try{
              dataRetorno = formatter.format(data);
           }catch(Exception e){
             throw new DataInvalidaException("Valor passado não pode ser convertido para String");
           }
               
           
           return dataRetorno;        
    }
   
      // Recebe a String no formato yyyy-MM-dd e converte para data
    public static  Date convertData(String data){
           DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date dataRetorno = (Date)formatter.parse(data);
                
                return dataRetorno;
            } catch (ParseException ex) {
                Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;    
    }
    //Recebe a data em String americana e retorna no padrão brasil
    public static  String convertData2(String data){
           DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date dataRetorno = (Date)formatter.parse(data);
                
               try {
                   return stringToData(dataRetorno);
               } catch (DataInvalidaException ex) {
                   Logger.getLogger(DataHora.class.getName()).log(Level.SEVERE, null, ex);
               }
            } catch (ParseException ex) {
                Logger.getLogger(JFrameCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;    
    }

}


    
    

