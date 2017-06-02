/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.control;

import com.pbj.loccar.model.Usuario;
import com.pbj.loccar.persistence.UsuarioDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public class UsuarioControl {
    
    
    
    public static void salvarUsuario(String login,String nome, String senha, String acesso){
        Usuario user = new Usuario();
        user.setLoginUser(login);
        user.setNomeUser(nome);      
        user.setSenhaUser(senha);
        user.setAcessoUser(acesso);
        
        UsuarioDAO userDao= new UsuarioDAO();
        
        userDao.createUsuario(user);
        
        
    }
    /*
    //Converte o retorno Lista de OBJETO do DAO e Converte em Vetor de 
    
    0 = ID
    1 = login
    2 = nome
    3 = Acesso
    4 = Senha
    
    */
    public static List<String[]> lerUsuario(){
        
        List<String[]> users = new ArrayList<>();
                
        List<Usuario> userList = new UsuarioDAO().readUsuario();
        
        for(int i = 0 ; i < userList.size(); i++){
            
            String userTemp[] = new String[5];
            
            userTemp[0] = Integer.toString(userList.get(i).getId());
            userTemp[1] = userList.get(i).getLoginUser();
            userTemp[2] = userList.get(i).getNomeUser();    
            userTemp[3] = userList.get(i).getAcessoUser();
            userTemp[4] = userList.get(i).getSenhaUser();
             
            users.add(userTemp);
            
        } 
        
        return users;        
    }
    
    
    public static String[] logarUsuario(String login, String senha){
        
        Usuario user = new UsuarioDAO().loginUsuario(login, senha);
        
        String userTemp[] = new String[5];
            
            userTemp[0] = Integer.toString(user.getId());
            userTemp[1] = user.getLoginUser();
            userTemp[2] = user.getNomeUser();    
            userTemp[3] = user.getAcessoUser();
            userTemp[4] = user.getSenhaUser();
        
        
        return userTemp;
    }
    
    
    public static void atualizarUsuario(int id,String login,String nome, String senha, String acesso){
        
        
        Usuario user = new Usuario();
        user.setId(id);
        user.setLoginUser(login);
        user.setNomeUser(nome);      
        user.setSenhaUser(senha);
        user.setAcessoUser(acesso);
        
        UsuarioDAO userDao = new UsuarioDAO();
        
        userDao.updateUsuario(user);
    }
    //Recebe o ID da interface e Acessa a persistencia e apaga o registro
    public static void apagarUsuario(int id){
        
        Usuario user = new Usuario();
        user.setId(id);
        UsuarioDAO userDao = new UsuarioDAO();
        userDao.deleteUsuario(user);
        
        
    }
    
    
}
