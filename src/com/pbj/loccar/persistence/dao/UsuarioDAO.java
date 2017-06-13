/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbj.loccar.persistence.dao;

import com.pbj.loccar.persistence.UsuarioPersistence;
import com.pbj.loccar.model.Usuario;
import com.pbj.loccar.persistence.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akr-Taku
 */
public class UsuarioDAO implements UsuarioPersistence {

    /*
        Recebe objeto Usuario e salva no banco de dados;
     */
    @Override
    public void createUsuario(Usuario user) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

        stmt = conn.prepareStatement("INSERT INTO usuario(loginUser,nomeUser,senhaUser,acessoUser)VALUES(?,?,?,?)");

        stmt.setString(1, user.getLoginUser());
        stmt.setString(2, user.getNomeUser());
        stmt.setString(3, user.getSenhaUser());
        stmt.setString(4, user.getAcessoUser());

        stmt.executeUpdate();

        ConnectionFactory.closeConnection(conn, stmt);

    }
    //Retorna os dados do usuario que vieram diretamete do banco de dados;

    @Override
    public List<Usuario> readUsuario() throws SQLException {

        List<Usuario> users = new ArrayList<>();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM usuario");

        rs = stmt.executeQuery();

        while (rs.next()) {
            Usuario user = new Usuario();

            user.setId(rs.getInt("id"));
            user.setLoginUser(rs.getString("loginUser"));
            user.setNomeUser(rs.getString("nomeUser"));
            user.setAcessoUser(rs.getString("acessoUser"));
            user.setSenhaUser(rs.getString("senhaUser"));

            users.add(user);
        }

        ConnectionFactory.closeConnection(conn, stmt, rs);

        return users;
    }

    @Override
    public Usuario loginUsuario(String login, String senha) throws SQLException {

        Usuario user = new Usuario();

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;
        ResultSet rs;

        stmt = conn.prepareStatement("SELECT * FROM usuario WHERE loginUser = ? AND senhaUser = ?");

        stmt.setString(1, login);
        stmt.setString(2, senha);

        rs = stmt.executeQuery();
        if (rs.next()) {
            user.setId(rs.getInt("id"));
            user.setLoginUser(rs.getString("loginUser"));
            user.setNomeUser(rs.getString("nomeUser"));
            user.setAcessoUser(rs.getString("acessoUser"));
            user.setSenhaUser(rs.getString("senhaUser"));
        }

        ConnectionFactory.closeConnection(conn, stmt, rs);

        return user;
    }

    //Recebe um Usuario e atualiza ele no BAnco de dados
    @Override
    public void updateUsuario(Usuario user) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

        stmt = conn.prepareStatement("UPDATE usuario SET loginUser = ?,nomeUser = ? ,senhaUser = ?,acessoUser = ? WHERE id = ?");

        stmt.setString(1, user.getLoginUser());
        stmt.setString(2, user.getNomeUser());
        stmt.setString(3, user.getSenhaUser());
        stmt.setString(4, user.getAcessoUser());
        stmt.setInt(5, user.getId());

        stmt.executeUpdate();

        ConnectionFactory.closeConnection(conn, stmt);

    }

    //Recebe o Usuario e Apaga o registro no banco
    @Override
    public void deleteUsuario(Usuario user) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt;

        stmt = conn.prepareStatement("DELETE FROM usuario WHERE id = ?");

        stmt.setInt(1, user.getId());

        stmt.executeUpdate();

        ConnectionFactory.closeConnection(conn, stmt);

    }
}
