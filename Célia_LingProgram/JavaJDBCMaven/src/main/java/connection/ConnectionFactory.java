package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nikaolly
 */
public class ConnectionFactory {

//    Encontrar o driver apenas seguir o caminho dele
//    URL padrao my sql, colocar o nome d banco no final
//   
    private static final String USUARIO = "root";
    private static final String SENHA = "#Gf50421474890";
    private static final String URL = "jdbc:mysql://localhost:3306/dbloja?useTimezone=true&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
      public static Connection getConnection() {
        try {
            
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
            
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("aaaa Erro na conecao", ex);
        } catch (SQLException ex) {
            throw new RuntimeException("oooooo Erro na conecao", ex);
        }
       
    }
//      public static void main(String[] args) {
//        System.out.println("Banco conectado com sucesso!");
//        getConnection();
//    }
//    Fechando conexao
    public static void closeConnection(Connection con) {

        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con);

    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con, stmt);

    }

}
