/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;
import com.pbj.loccar.model.Locadora;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 */
public class LocadoraTest extends TestCase{
    
    Locadora locadora;
    Locadora locadora1;
    Locadora locadora2;
    
    @Override
    public void setUp(){
        locadora = new Locadora();
        locadora1 = new Locadora();
        locadora2 = new Locadora();
    }

    @Override
    public void tearDown(){
        locadora = null;
        locadora1 = null;
        locadora2 = null;
    }
    
    public void testCalculoDesconto(){
        locadora.setDesconto(10);
        locadora.setIsDesconto(true);
        locadora.setValorDiaria(10.0);
        locadora.setQtdDias(2);
        
        locadora1.setIsDesconto(false);
        
        
        double descontoteste1 = locadora1.calculoDesconto();
        double descontoteste = locadora.calculoDesconto();
        
        assertEquals(descontoteste, 2.0);
        assertEquals(descontoteste1, 0.0);
        
    }
    
    public void testCalculoSubTotal(){
        
        locadora.setDesconto(10);
        locadora.setIsDesconto(true);
        locadora.setValorDiaria(10.0);
        locadora.setQtdDias(2);
        
        locadora1.setIsDesconto(false);
        locadora1.setQtdDias(2);
        locadora1.setValorDiaria(10.0);
        
        double subtotalteste = locadora.calculoSubTotal(locadora);
        double subtotalteste1 = locadora1.calculoSubTotal(locadora1);
        
        assertEquals(subtotalteste, 18.0);
        assertEquals(subtotalteste1, 20.0);
    }
    
    public void testCalculoValorFinal(){
        locadora.setIsDesconto(true);
        locadora.setAtrasoLocacao(true);
        locadora.setValorDiaria(10.0);
        locadora.setQtdDias(2);
        locadora.setDesconto(10);
        locadora.setDiasAtraso(2);
        locadora.setSubTotal(locadora.calculoSubTotal(locadora));
        
        locadora1.setDiasAtraso(2);
        locadora1.setIsDesconto(false);
        locadora1.setAtrasoLocacao(true);
        locadora1.setValorDiaria(10.0);
        locadora1.setQtdDias(2);
        locadora1.setDiasAtraso(2);
        locadora1.setSubTotal(locadora1.calculoSubTotal(locadora1));
        
        
        locadora2.setIsDesconto(false);
        locadora2.setAtrasoLocacao(false);
        locadora2.setValorDiaria(10.0);
        locadora2.setQtdDias(2);
        locadora2.setSubTotal(locadora2.calculoSubTotal(locadora2));
        
        
        double valorFinalTeste = locadora.calculoValorFinal(locadora);
        double valorFinalTeste1 = locadora1.calculoValorFinal(locadora1);
        double valorFinalTeste2 = locadora2.calculoValorFinal(locadora2);
        
        assertEquals(valorFinalTeste, 36.0);
        assertEquals(valorFinalTeste1, 40.0);
        assertEquals(valorFinalTeste2, 20.0);
        
        
    }
    
}
