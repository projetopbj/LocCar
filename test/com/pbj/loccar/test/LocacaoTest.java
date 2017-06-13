/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.test;

import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import java.text.ParseException;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 */
public class LocacaoTest extends TestCase {
    
    public LocacaoTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testIsStatusLocacao() throws ParseException {
        System.out.println("isStatusLocacao");
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.isStatusLocacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetStatusLocacao() throws ParseException {
        System.out.println("getStatusLocacao");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.getStatusLocacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetStatusLocacao() throws ParseException {
        System.out.println("setStatusLocacao");
        boolean statusLocacao = false;
        Locacao instance = new Locacao();
        instance.setStatusLocacao(statusLocacao);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testIsDesconto() throws ParseException {
        System.out.println("isDesconto");
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.isDesconto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDesconto() throws ParseException {
        System.out.println("getDesconto");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.getDesconto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDesconto() throws ParseException {
        System.out.println("setDesconto");
        boolean desconto = false;
        Locacao instance = new Locacao();
        instance.setDesconto(desconto);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetValorDesconto() throws ParseException {
        System.out.println("getValorDesconto");
        Locacao instance = new Locacao();
        double expResult = 0.0;
        double result = instance.getValorDesconto();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetValorDesconto() throws ParseException {
        System.out.println("setValorDesconto");
        double valorDesconto = 0.0;
        Locacao instance = new Locacao();
        instance.setValorDesconto(valorDesconto);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetId() throws ParseException {
        System.out.println("getId");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetId() throws ParseException {
        System.out.println("setId");
        int id = 0;
        Locacao instance = new Locacao();
        instance.setId(id);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetVeiculo() throws ParseException {
        System.out.println("getVeiculo");
        Locacao instance = new Locacao();
        Veiculo expResult = null;
        Veiculo result = instance.getVeiculo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetVeiculo() throws ParseException {
        System.out.println("setVeiculo");
        Veiculo idVeiculo = null;
        Locacao instance = new Locacao();
        instance.setVeiculo(idVeiculo);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDescricao() throws ParseException {
        System.out.println("getDescricao");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDescricao() throws ParseException {
        System.out.println("setDescricao");
        String descricao = "";
        Locacao instance = new Locacao();
        instance.setDescricao(descricao);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetQtdDias() throws ParseException {
        System.out.println("getQtdDias");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.getQtdDias();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetQtdDias() throws ParseException {
        System.out.println("setQtdDias");
        int qtdDias = 0;
        Locacao instance = new Locacao();
        instance.setQtdDias(qtdDias);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDataDoAluguel() throws ParseException {
        System.out.println("getDataDoAluguel");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataDoAluguel();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDataDoAluguel() throws ParseException {
        System.out.println("setDataDoAluguel");
        Date dataDoAluguel = null;
        Locacao instance = new Locacao();
        instance.setDataDoAluguel(dataDoAluguel);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDataDaDevolucao() throws ParseException {
        System.out.println("getDataDaDevolucao");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataDaDevolucao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDataDaDevolucao() throws ParseException {
        System.out.println("setDataDaDevolucao");
        Date dataDaDevolucao = null;
        Locacao instance = new Locacao();
        instance.setDataDaDevolucao(dataDaDevolucao);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetSubTotal() throws ParseException {
        System.out.println("getSubTotal");
        Locacao instance = new Locacao();
        double expResult = 0.0;
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetSubTotal() throws ParseException {
        System.out.println("setSubTotal");
        double subTotal = 0.0;
        Locacao instance = new Locacao();
        instance.setSubTotal(subTotal);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testIsAtrasoLocacao() throws ParseException {
        System.out.println("isAtrasoLocacao");
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.isAtrasoLocacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetAtrasoLocacao() throws ParseException {
        System.out.println("getAtrasoLocacao");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.getAtrasoLocacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetAtrasoLocacao() throws ParseException {
        System.out.println("setAtrasoLocacao");
        boolean atrasoLocacao = false;
        Locacao instance = new Locacao();
        instance.setAtrasoLocacao(atrasoLocacao);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDiasAtraso() throws ParseException {
        System.out.println("getDiasAtraso");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.getDiasAtraso();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDiasAtraso() throws ParseException {
        System.out.println("setDiasAtraso");
        int diasAtraso = 0;
        Locacao instance = new Locacao();
        instance.setDiasAtraso(diasAtraso);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetDataRetorno() throws ParseException {
        System.out.println("getDataRetorno");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataRetorno();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetDataRetorno() throws ParseException {
        System.out.println("setDataRetorno");
        Date dataRetorno = null;
        Locacao instance = new Locacao();
        instance.setDataRetorno(dataRetorno);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetValorFinal() throws ParseException {
        System.out.println("getValorFinal");
        Locacao instance = new Locacao();
        double expResult = 0.0;
        double result = instance.getValorFinal();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetValorFinal() throws ParseException {
        System.out.println("setValorFinal");
        double valorFinal = 0.0;
        Locacao instance = new Locacao();
        instance.setValorFinal(valorFinal);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testGetCliente() throws ParseException {
        System.out.println("getCliente");
        Locacao instance = new Locacao();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testSetCliente() throws ParseException {
        System.out.println("setCliente");
        Cliente idCliente = null;
        Locacao instance = new Locacao();
        instance.setCliente(idCliente);
        fail("The test case is a prototype.");
    }

    /**
     *
     * @throws java.text.ParseException
     */
    public void testHashCode() throws ParseException {
        System.out.println("hashCode");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testEquals() throws ParseException {
        System.out.println("equals");
        Object obj = null;
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testAlugar() throws ParseException {
        System.out.println("alugar");
        int desconto = 0;
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.alugar(desconto);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testDevolver() throws ParseException {
        System.out.println("devolver");
        Locacao instance = new Locacao();
        boolean expResult = false;
        boolean result = instance.devolver();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * 
     * @throws java.text.ParseException
     */
    public void testToString() throws ParseException {
        System.out.println("toString");
        Locacao instance = new Locacao();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
