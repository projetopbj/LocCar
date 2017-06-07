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
        usuarioDAO.createUsuario(usuario);
    }
    
    public void testreadUsuario(){
        usuarioDAO.readUsuario();
    }
    
    public void testloginUsuario(){
        usuarioDAO.loginUsuario("Admin", "Admin");
    }
    
    public void testupdateUsuario(){
        usuarioDAO.updateUsuario(usuario);
    }
    
    public void testdeleteUsuario(){
        usuarioDAO.deleteUsuario(usuario);
    }
}
