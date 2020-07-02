/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Categoria;
/**
 *
 * @author Nikaolly
 */
public class categoriaDAO {
    
    private Connection con = null;

    public categoriaDAO() {
//        con = ConnectionFactory.getConnection();
    }
    
//    Inserindo dados na tabela
    public boolean save(Categoria categoria){
    
        String sql = "INSERT INTO CATEGORIA (descricao) VALUES (?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, categoria.getDescricao());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con , stmt);
        }
        
    }
    
}
