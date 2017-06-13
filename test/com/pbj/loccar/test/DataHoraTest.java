/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.test;

import com.pbj.loccar.util.DataHora;
import java.util.Date;
import junit.framework.TestCase;

/**
 *
 * @author lucas
 */
public class DataHoraTest extends TestCase {
    
    public DataHoraTest(String testName) {
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
     * Test getHora.
     */
    public void testGetHora() {
        System.out.println("getHora");
        String expResult = "";
        String result = DataHora.getHora();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test getData.
     */
    public void testGetData() {
        System.out.println("getData");
        String expResult = "";
        String result = DataHora.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test somaDias.
     */
    public void testSomaDias_Date_int() {
        System.out.println("somaDias");
        Date data = null;
        int dias = 0;
        Date expResult = null;
        Date result = DataHora.somaDias(data, dias);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test somaDias.
     * @throws java.lang.Exception
     */
    public void testSomaDias_String_String() throws Exception {
        System.out.println("somaDias");
        String data = "";
        String diaS = "";
        String expResult = "";
        String result = DataHora.somaDias(data, diaS);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test subDias.
     * @throws java.lang.Exception
     */
    public void testSubDias() throws Exception {
        System.out.println("subDias");
        String dataDev = "";
        String dataHoje = "";
        long expResult = 0L;
        long result = DataHora.subDias(dataDev, dataHoje);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test dataToString.
     * @throws java.lang.Exception
     */
    public void testDataToString() throws Exception {
        System.out.println("dataToString");
        String data = "";
        Date expResult = null;
        Date result = DataHora.dataToString(data);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test stringToData.
     * @throws java.lang.Exception
     */
    public void testStringToData() throws Exception {
        System.out.println("stringToData");
        Date data = null;
        String expResult = "";
        String result = DataHora.stringToData(data);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test convertData.
     */
    public void testConvertData() {
        System.out.println("convertData");
        String data = "02-02-2017";
        String expResult = "Wed Aug 10 00:00:00 BRT 7";
        Date result = DataHora.convertData(data);
        assertEquals(expResult, result.toString());
        fail("The test case is a prototype.");
    }

    /**
     * Test convertData2.
     */
    public void testConvertData2() {
        System.out.println("convertData2");
        String data = "02-02-2017";
        String expResult = "10/08/0007";
        String result = DataHora.convertData2(data);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
