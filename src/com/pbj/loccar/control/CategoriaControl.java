/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Categoria;
import com.pbj.loccar.persistence.dao.CategoriaDAO;
import java.util.ArrayList;
import java.util.List;
import com.pbj.loccar.persistence.CategoriaPersistence;

/**
 *
 * @author Akr-Taku
 * 
 * 
 * Classe de Controle que tem acesso ao Model, View e DAO - Da Categoria
 */
public class CategoriaControl {
    
    //Salva a Categoria no Banco de dados
    /**
     *
     * @param nome
     * @param valorDia
     * @param valorKm
     * @param ar
     * @param vidro
     * @param direcao
     */
    public static void salvarCategoria(String nome,double valorDia, double valorKm, boolean ar, boolean vidro, boolean direcao){
        Categoria categoria = new Categoria();
        
        categoria.setNome(nome);
        categoria.setValorDia(valorDia);
        categoria.setValorKm(valorKm);
        categoria.setAr(ar);
        categoria.setVidro(vidro);
        categoria.setDirecao(direcao);
        
        CategoriaPersistence dao = new CategoriaDAO();
        dao.createCategoria(categoria);
        
        
    }
    /*
    Converte o retorno Lista de Categoria do DAO e Converte em Vetor de String 
    0 = ID       -- Int
    1 = nome     -- Varchar
    2 = valorDia -- Double
    3 = valorKm  -- Double
    4 = ar       -- Boolean
    5 = vidro    -- Boolean
    6 = direcao  -- Boolean
    */
    public static List<String[]> lerCategoria(){
        
        List<String[]> categorias = new ArrayList<>();
                
        List<Categoria> categList = new CategoriaDAO().readCategoria();
        
        for(int i = 0 ; i < categList.size(); i++){
            
            String categTemp[] = new String[7];
            
            categTemp[0] = Integer.toString(categList.get(i).getId());
            categTemp[1] = categList.get(i).getNome();
            categTemp[2] = Double.toString(categList.get(i).getValorDia());
            categTemp[3] = Double.toString(categList.get(i).getValorKm());
            categTemp[4] = categList.get(i).getAr();
            categTemp[5] = categList.get(i).getVidro();
            categTemp[6] = categList.get(i).getDirecao();
            
            categorias.add(categTemp);   
        }   
        return categorias;        
    }
    
    
    //Retorna apenas os nomes das Categorias.
    public static List<String> returnNamesCategoria(){
        
        List<String> categNames = new ArrayList<>();
                
        List<Categoria> categList = new CategoriaDAO().readCategoria();
        
        for(int i = 0 ; i < categList.size(); i++){
            
            String categTemp = categList.get(i).getNome();
             
            categNames.add(categTemp);   
        }   
        return categNames;        
    }
   
    //Atualiza a categoria recebendo os dados da tabela na view
    public static void atualizarCategoria(int id, String nome,double valorDia, double valorKm, boolean ar, boolean vidro, boolean direcao){
                
        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setNome(nome);
        categoria.setValorDia(valorDia);
        categoria.setValorKm(valorKm);
        categoria.setAr(ar);
        categoria.setVidro(vidro);
        categoria.setDirecao(direcao);

        
        CategoriaPersistence dao = new CategoriaDAO();
        
        dao.updateCategoria(categoria);
    }
    //Recebe o ID da interface e Acessa a persistencia e apaga o registro
    public static void apagarCategoria(int id){
        
        Categoria categ = new Categoria();
        categ.setId(id);
        CategoriaPersistence dao = new CategoriaDAO();
        dao.deleteCategoria(categ);
        
        
    }
    
    
    
    
    
    
}
