package login.viss;

/**
 *
 * @author Nikaolly
 */
public class SistemaLogin extends Usuario{
  private String inputLogin;
  private String inputSenha;
  public Boolean senhaBoolean = false; 
  public Boolean loginBoolean = false;

    public SistemaLogin(String userName, String loginCPF, String loginSenha) {
        setLoginSenha(loginSenha);
        setLoginCPF(loginCPF);
        setUserName(userName);
    }

    public void validar(){
    validarLogin();
    validarSenha();
    }
  
  public void validarLogin(){
      if(getLoginCPF().equals(getInputLogin())){
          setLoginBoolean(true);
          System.out.println("login correto");
      }else{
          setLoginBoolean(false);
          System.err.println("Login incorreta");
      }
  }
   public void validarSenha(){
      if(getLoginSenha().equals(getInputSenha())){
          setSenhaBoolean(true);
          System.out.println("Senha correto");
      }else{
          setSenhaBoolean(false);
          System.err.println("senha incorreta");
      }
  }
  
  
  
  
    public String getInputLogin() {
        return inputLogin;
    }

    public void setInputLogin(String inputLogin) {
        this.inputLogin = inputLogin;
    }

    public String getInputSenha() {
        return inputSenha;
    }

    public void setInputSenha(String inputSenha) {
        this.inputSenha = inputSenha;
    }
   public Boolean getSenhaBoolean() {
        return senhaBoolean;
    }

    public void setSenhaBoolean(Boolean senhaBoolean) {
        this.senhaBoolean = senhaBoolean;
    }

    public Boolean getLoginBoolean() {
        return loginBoolean;
    }

    public void setLoginBoolean(Boolean loginBoolean) {
        this.loginBoolean = loginBoolean;
    }
 
}
