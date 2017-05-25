/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author lucas
 */
public class PersistenceVeiculo {
    private static Statement stmt;
    private static ResultSet rs;
    
    private static Conexao conexao = new Conexao();
    
}
