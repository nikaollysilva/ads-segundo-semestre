/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.DadosConexao;
import interfaceViss.TelaSistemaLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import login.viss.Usuario;

/**
 *
 * @author Nikaolly
 */
public class UserDao {

//    ConexaoFactory dadosConexao = new ConexaoFactory();
    DadosConexao connection = new DadosConexao();
    Connection con = connection.connect();
    PreparedStatement pstm = null;
    ResultSet resultSet = null;

    public Usuario buscarDados(Usuario usuario) {
        Usuario user = usuario;

        try {
            //SELECTS
//          String selectSql = "SELECT * FROM dados;";
            String selectSql = "SELECT * FROM usuario WHERE documentoUsuario = ?";
//          String selectSql = "SELECT * FROM usuario WHERE documentoUsuario = ? and nomeUsuario = ?";
            pstm = con.prepareStatement(selectSql);
            pstm.setString(1, user.getLoginCPF());
//            pstm.setString(2, user.getUserName());
            resultSet = pstm.executeQuery();
            // Print results from select statement
            while (resultSet.next()) {
                user.setId(resultSet.getInt("idUsuario"));
                user.setUserName(resultSet.getString("nomeUsuario"));
                user.setLoginCPF(resultSet.getString("documentoUsuario"));
                user.setLoginSenha(resultSet.getString("senhaUsuario"));
            }
        } catch (SQLException e) {
            System.err.println("Connection Error");
        }
        return usuario;
    }
}
