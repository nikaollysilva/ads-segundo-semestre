/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConexaoFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Nikaolly
 */
public class Comandos {

    ConexaoFactory dadosConexao = new ConexaoFactory();
    ResultSet resultSet = null;

    public void Inserir(String cont) {
        dadosConexao.Conectar();
        try (Connection connection = DriverManager.getConnection(dadosConexao.getConnectionUrl());
                Statement statement = connection.createStatement();) {

            System.out.println("Inserido Com sucesso!");
            // Create and execute a SELECT SQL statement.
            String insertSql = "INSERT INTO dados(memoria) VALUES('"+cont+"')";
            resultSet = statement.executeQuery(insertSql);

        } catch (SQLException e) {
//            System.out.println("Erro ao inserir no banco");
        }

    }

    public void Selecionar() {
        ResultSet resultSet = null;
        dadosConexao.Conectar();
        try (Connection connection = DriverManager.getConnection(dadosConexao.getConnectionUrl());
                Statement statement = connection.createStatement();) {

            //SELECTSSSSS
//            String selectSql = "SELECT * FROM dados;";
            String selectSql = "SELECT (memoria) FROM dados WHERE id = 1;";
            resultSet = statement.executeQuery(selectSql);

//            System.out.println(resultSet.toString());
            // Print results from select statement
            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
