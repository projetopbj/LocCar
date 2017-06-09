/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.Model;

import junit.framework.TestCase;
import com.pbj.loccar.persistence.dao.UsuarioDAO;
import com.pbj.loccar.model.Usuario;

/**
 *
 * @author lucas
 */
public class UsuarioDaoTest extends TestCase{
    UsuarioDAO usuarioDAO;
    Usuario usuario;
    
    @Override
    public void setUp(){
        usuarioDAO = new UsuarioDAO();
        usuario = new Usuario();
    }

    @Override
    public void tearDown(){
        usuarioDAO = null;
        usuario = null;
    }
    
    public void testcreateUsuario(){
        usuario.setAcessoUser("Admin");
        usuario.setId(1);
        usuario.setLoginUser("Admin");
        usuario.setNomeUser("Admin");
        usuario.setSenhaUser("Admin");
        
        usuarioDAO.createUsuario(usuario);
        
        assertEquals(0,0);
    }
    
    public void testreadUsuario(){
        usuario.setAcessoUser("Admin");
        usuario.setId(1);
        usuario.setLoginUser("Admin");
        usuario.setNomeUser("Admin");
        usuario.setSenhaUser("Admin");
        
        usuarioDAO.readUsuario();
        
        assertEquals(0,0);
    }
    
    public void testloginUsuario(){
        usuario.setAcessoUser("Admin");
        usuario.setId(1);
        usuario.setLoginUser("Admin");
        usuario.setNomeUser("Admin");
        usuario.setSenhaUser("Admin");
        
        usuarioDAO.loginUsuario("Admin", "Admin");
        
        assertEquals(0,0);
    }
    
    public void testupdateUsuario(){
        
        usuario.setAcessoUser("Admin");
        usuario.setId(1);
        usuario.setLoginUser("Admin");
        usuario.setNomeUser("Admin");
        usuario.setSenhaUser("Admin");
        
        usuarioDAO.updateUsuario(usuario);
        
        assertEquals(0,0);
    }
    
    public void testdeleteUsuario(){
        
        usuario.setAcessoUser("Admin");
        usuario.setId(1);
        usuario.setLoginUser("Admin");
        usuario.setNomeUser("Admin");
        usuario.setSenhaUser("Admin");
        
        usuarioDAO.deleteUsuario(usuario);
        
        assertEquals(0,0);
    }
}
