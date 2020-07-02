package connection;

//jdbc:sqlserver://srvsmartwine.database.windows.net:1433;
//database=bdsmartwine;
//user=usersmartwine@srvsmartwine;
//password={your_password_here};
//encrypt=true;
//trustServerCertificate=false;
//hostNameInCertificate=*.database.windows.net;
//    192-1b-grupo9@banctec.com.br
//    private static final String USUARIO = "usersmartwine@srvsmartwine";
//    private static final String SENHA = "#Gfgrupo9b";
//    private static final String URL = "jdbc:sqlserver://srvsmartwine.database.windows.net:1433/bdsmartwine";
//    private static final String DRIVER = "com.microsoft.sqlserver";
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    String connectionUrl = null;

    public ConexaoFactory() {
        connectionUrl
                = "jdbc:sqlserver://srvsmartwine.database.windows.net:1433;"
                + "database=bdsmartwine;"
                + "user=usersmartwine@srvsmartwine;"
                + "password=#Gfgrupo9b;"
                + "encrypt=true;"
                + "trustServerCertificate=false;"
                + "hostNameInCertificate=*.database.windows.net;"
                + "loginTimeout=30;";
    }

    public Connection Conectar() {
        try (Connection connection = DriverManager.getConnection(getConnectionUrl())) {
            System.out.println("CONECTADO AO AZURE");
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println("Erro ao Conectar no banco");
        }
        return null;
    }
    
//    public static void main(String[] args) {
//        ConexaoFactory c = new ConexaoFactory();
//        c.Conectar();
//    }

    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

}
