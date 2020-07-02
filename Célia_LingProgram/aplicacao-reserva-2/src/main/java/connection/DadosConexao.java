package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class DadosConexao {

    public Connection connect() {

        String connectionUrl = null;
        connectionUrl
                = "jdbc:sqlserver://srvsmartwine.database.windows.net:1433;"
                + "database=bdsmartwine;"
                + "user=usersmartwine@srvsmartwine;"
                + "password=#Gfgrupo9b;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionUrl);
            System.out.println("Connected to the Azure server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }

}
