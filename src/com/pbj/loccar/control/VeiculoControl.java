/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Categoria;
import com.pbj.loccar.model.Veiculo;
import com.pbj.loccar.persistence.VeiculoPersistence;
import com.pbj.loccar.persistence.dao.CategoriaDAO;
import com.pbj.loccar.persistence.dao.VeiculoDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * Classe de Controle que tem acesso ao Model, View e DAO - Da Veiculo
 */
public class VeiculoControl {
    
    //Salva o Veiculo no Banco de dados
    /**
     *
     * @param placa
     * @param modelo
     * @param chassi
     * @param ano
     * @param marca
     * @param numPortas
     * @param cor
     * @param NomeCategoria
     */
    public static void salvarVeiculo(String placa,String modelo, String chassi,int ano,String marca, int numPortas, String cor, String NomeCategoria){
        
        Veiculo veiculo = new Veiculo();
        Categoria categ = new CategoriaDAO().retornaCategoria(NomeCategoria);
        
        veiculo.setPlaca(placa);
        veiculo.setModelo(modelo);
        veiculo.setChassi(chassi);
        veiculo.setMarca(marca);
        veiculo.setAno(ano);
        veiculo.setnPortas(numPortas);
        veiculo.setCor(cor);
        veiculo.setCategoria(categ);
        
        
       new VeiculoDAO().createVeiculo(veiculo);
        
        
    }
    /*
    Converte o retorno Lista de Veiculos do DAO e Converte em Vetor de String 
    0 = id      
    1 = placa     
    2 = modelo 
    3 = chassi  
    4 = ano       
    5 = marca    
    6 = numPortas  
    7 = cor
    8 = alugado
    9 = idCategoria // Na verdade será mostrado o nome e não o ID
    */
    public static List<String[]> lerVeiculo(boolean alugado ){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(alugado);
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }
    
    public static List<String[]> lerVeiculo(String modelo,boolean alugado ){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(modelo, alugado);
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }
    
    public static List<String[]> lerVeiculo(String modelo){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(modelo);
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }

    public static List<String[]> lerVeiculo(int ano,boolean alugado ){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(ano, alugado);
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }
    
    public static List<String[]> lerVeiculo(int ano){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(ano);
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }

    public static List<String[]> lerVeiculo(){
        
        List<String[]> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo();
        
        for(int i = 0 ; i < veicList.size(); i++){
            
            String veicTemp[] = new String[10];
            
            veicTemp[0] = Integer.toString(veicList.get(i).getId());
            veicTemp[1] = veicList.get(i).getPlaca();
            veicTemp[2] = veicList.get(i).getModelo();
            veicTemp[3] = veicList.get(i).getChassi();
            veicTemp[4] = Integer.toString(veicList.get(i).getAno());
            veicTemp[5] = veicList.get(i).getMarca();
            veicTemp[6] = Integer.toString(veicList.get(i).getnPortas());
            veicTemp[7] = veicList.get(i).getCor();
            veicTemp[8] = veicList.get(i).getAlugado();
            veicTemp[9] = veicList.get(i).getCategoria().getNome();
            
            veiculos.add(veicTemp);   
        }   
        return veiculos;        
    }
    
    
    public static List<String> returnVeiculoID(){
        
        List<String> veiculos = new ArrayList<>();
                
        List<Veiculo> veicList = new VeiculoDAO().readVeiculo(false);
        
        for(int i = 0 ; i < veicList.size(); i++){
            String veicNames;
            
            
            veicNames = Integer.toString(veicList.get(i).getId());

            veiculos.add(veicNames);   
        }   
        return veiculos;        
    }
    
    
    //Retorna Veiculo pegando apenas o ID
    public static String[] pegaVeiculo(int id){
          
        Veiculo veicList = new VeiculoDAO().retornaVeiculo(id);
   
            String veicTemp[] = new String[11];
          
            veicTemp[0] = Integer.toString(veicList.getId());
            veicTemp[1] = veicList.getPlaca();
            veicTemp[2] = veicList.getModelo();
            veicTemp[3] = veicList.getChassi();
            veicTemp[4] = Integer.toString(veicList.getAno());
            veicTemp[5] = veicList.getMarca();
            veicTemp[6] = Integer.toString(veicList.getnPortas());
            veicTemp[7] = veicList.getCor();
            veicTemp[8] = veicList.getAlugado();
            veicTemp[9] = veicList.getCategoria().getNome();
            veicTemp[10] = Double.toString(veicList.getCategoria().getValorDia());

        return veicTemp;
        
        
    }
     

   
    //Atualiza o Veiculo recebendo os dados da tabela na view
    public static void atualizarVeiculo(int id,String placa,String modelo, String chassi,int ano,String marca, int numPortas, String cor, String Categoria){
                
        Veiculo veiculo = new Veiculo();
        Categoria categ = new CategoriaDAO().retornaCategoria(Categoria);
      
        veiculo.setId(id);
        veiculo.setPlaca(placa);
        veiculo.setModelo(modelo);
        veiculo.setChassi(chassi);
        veiculo.setMarca(marca);
        veiculo.setAno(ano);
        veiculo.setnPortas(numPortas);
        veiculo.setCor(cor);
        veiculo.setCategoria(categ); // Não necessário outros dados da categoria, pois será salvo apenas o ID
        
        VeiculoPersistence dao = new VeiculoDAO();
        
        dao.updateVeiculo(veiculo);
    }
    //Recebe o ID da interface e Acessa a persistencia e apaga o registro
    public static void apagarVeiculo(int id){
        
        Veiculo veic = new Veiculo();
        veic.setId(id);
        VeiculoPersistence dao = new VeiculoDAO();
        dao.deleteVeiculo(veic);
        
        
    }
    
    
}
