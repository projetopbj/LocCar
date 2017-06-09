/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.control.LocacaoControl;
import com.pbj.loccar.model.Cliente;
import com.pbj.loccar.model.Locacao;
import com.pbj.loccar.model.Veiculo;
import java.util.Date;

/**
 *
 * @author Akr-Taku
 */
public class NewClass {
    
    public static void main(String args[]){
        
        Date dataHoje = new Date();
        
        Cliente cliente = new ClienteDAO().retornaCliente(1);
        Veiculo veiculo = new VeiculoDAO().retornaVeiculo(1);
        Locacao loc = new Locacao(cliente,veiculo);
        
        loc.setDescricao("Teste");
        loc.setDataDoAluguel(dataHoje);
        loc.setQtdDias(7);
        loc.setDesconto(true);
        loc.alugar(25);
        
        System.out.println(loc);
        
        LocacaoControl.salvarLocacao("Locacao Teste", dataHoje, 7, 1, 1, true, 25);
        
        
 
        
    }
    
}
