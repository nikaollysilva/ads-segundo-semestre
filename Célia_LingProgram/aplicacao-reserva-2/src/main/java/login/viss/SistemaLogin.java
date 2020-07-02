package login.viss;

import interfaceViss.AplicacaoViss;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikaolly
 */
public class SistemaLogin {

//    Metodos
    public Usuario validarLogin(Usuario user, String login, String senha) {
//        System.out.println(login + "sjdnfkjfnkdsjn");
//        System.out.println(senha + "dkjskjd");
//        System.out.println(user.getLoginSenha() + "Seu nome: " + user.getUserName() + "Doc: " + user.getLoginCPF());
        
        if ((user.getLoginCPF().equals(login)) && (user.getLoginSenha().equals(senha))){
            AplicacaoViss aplicacao = new AplicacaoViss();
            aplicacao.txtUsuario.setText("Bem vindo!" + user.getUserName());
            aplicacao.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Senha ou usuario incorreto(s)");
        }
        return user;
    }
}
