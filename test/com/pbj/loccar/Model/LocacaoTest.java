/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import com.pbj.loccar.model.Categoria;
import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import com.pbj.loccar.util.DataHora;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 * 
 * classe de teste para a classe locacao
 */
public class LocacaoTest extends TestCase{
    // declaro as variaveis usadas
    Locacao locacao;
    Veiculo veiculo;
    Categoria categoria;
    
    // inicio as variaveis
    @Override
    public void setUp(){
        veiculo = new Veiculo();
        locacao = new Locacao();
        categoria = new Categoria();
    }

    // fecho as variaveis
    @Override
    public void tearDown(){
        veiculo = null;
        locacao = null;
        categoria = null;
    }

    // testo o metodo alugar
    public void alugarTest(){
        locacao.setDataDoAluguel(DataHora.dataToString("12/06/17"));
        
        veiculo.setCategoria(categoria);
        veiculo.getCategoria().setValorDia(20);
        locacao.setQtdDias(2);
        veiculo.getCategoria().setValorKm(2);
        locacao.setAtrasoLocacao(true);
        locacao.setDiasAtraso(1);
        
        locacao.setVeiculo(veiculo);
        
        boolean testAlugarCarro;
        testAlugarCarro = locacao.alugar(10);
        
        assertEquals(true, testAlugarCarro);
        
    }
    
// testo o metodo devolver
    public void devolverTest(){
        
        veiculo.setCategoria(categoria);
        veiculo.getCategoria().setValorDia(20);
        locacao.setQtdDias(2);
        veiculo.getCategoria().setValorKm(2);
        locacao.setAtrasoLocacao(true);
        locacao.setDiasAtraso(1);
        locacao.setVeiculo(veiculo);
        
        boolean testDevolverCarro;
        testDevolverCarro = locacao.devolver();
        
        assertEquals(true, testDevolverCarro);
    }
}
