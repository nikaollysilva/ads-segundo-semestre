package login.viss;

/**
 *
 * @author Nikaolly
 */
public class Usuario {
//    dados que virao do banco de dados devem ser colocados nessas variaveis
    private String loginCPF = "12345678900";
    private String LoginSenha = "12345678";
    private String userName = "User Viss";

//    public Usuario(String userName, String loginCPF, String loginSenha){
//        this.userName = userName;
//        this.loginCPF = loginCPF;
//        this.LoginSenha = loginSenha;
//    }
    
//    GET SET
    public String getLoginCPF() {
        return loginCPF;
    }

    public void setLoginCPF(String loginCPF) {
        this.loginCPF = loginCPF;
    }

    public String getLoginSenha() {
        return LoginSenha;
    }

    public void setLoginSenha(String LoginSenha) {
        this.LoginSenha = LoginSenha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
