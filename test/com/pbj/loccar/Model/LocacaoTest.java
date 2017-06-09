/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 */
public class LocacaoTest extends TestCase{
    Locacao locacao;
    Veiculo veiculo;
    
    @Override
    public void setUp(){
        veiculo = new Veiculo();
        locacao = new Locacao();
    }

    @Override
    public void tearDown(){
        veiculo = null;
        locacao = null;
    }
    
    public void calculoDescontoTest(){
    
    }
    
    public void calculoSubTotalTest(){
    
    }
    
    public void calculoValorFinalTest(){
    
    }
    
    public void alugarTest(){
    
    }
    
    public void devolverTest(){
    
    }
}
