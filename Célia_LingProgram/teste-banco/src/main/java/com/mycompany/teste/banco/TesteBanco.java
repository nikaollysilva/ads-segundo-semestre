/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teste.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Nikaolly
 */
public class TesteBanco {
    
    private static final String USUARIO = "root";
    private static final String SENHA = "#Gf50421474890";
    private static final String URL = "jdbc:mysql://localhost:3306/dbloja?useTimezone=true&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
      public static Connection getConnection() {;
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("aaaa Erro na conecao", ex);
        } catch (SQLException ex) {
            throw new RuntimeException("oooooo Erro na conecao", ex);
        }
       
    }
     
     public static void main(String[] args) {
           getConnection();
        } 
}

