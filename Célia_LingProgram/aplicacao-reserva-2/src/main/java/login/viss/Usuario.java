package login.viss;

/**
 *
 * @author Nikaolly
 */
public class Usuario {

    private Integer id;
    private String loginCPF;
    private String loginSenha;
    private String userName;
    
//    GET SET
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginCPF() {
        return loginCPF;
    }

    public void setLoginCPF(String loginCPF) {
        this.loginCPF = loginCPF;
    }

    public String getLoginSenha() {
        return loginSenha;
    }

    public void setLoginSenha(String LoginSenha) {
        this.loginSenha = LoginSenha;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", loginCPF=" + loginCPF + ", loginSenha=" + loginSenha + ", userName=" + userName + '}';
    }

}
