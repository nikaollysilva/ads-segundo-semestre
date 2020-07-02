package desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikaolly
 */
public class ContaCorrente {

//ATRIBUTOS -->
    private String titular;
    private Double saldo;
//    Lista para registrar a ocorrencia(saque/deposito)
    private List<Historico> ocorrencia;

//CONSTRUTOR -->
    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
//        CRIANDO UM ARRAYLIST
        ocorrencia = new ArrayList<Historico>();
    }

//METODOS -->
//    Depositando e inserindo ocorrencia na lista
    public void depositar(Double valor) {
        Historico h = new Historico(valor, "Deposito");
        setSaldo(getSaldo() + valor);
        ocorrencia.add(h);
    }

//    Sacando e inserindo ocorrencia na lista
    public void sacar(Double valor) {
         Historico h = new Historico(valor, "Saque");
         
        if ((getSaldo() - valor) >= 0) {
            setSaldo(getSaldo() - valor);
            ocorrencia.add(h);
        }
// CASO ACHE MELHOR NOTIFICAR O USUARIO CASO NAO SEJA POSSIVEL EXECUTAR SAQUE, REMOVA O COMENTARIO
//        else{
//            System.out.println("Aviso(s): Sr(a)" + getTitular());
//            System.out.println(String.format("Data: %d/%d/%d Saque impossibilitado: Saldo insuficiente.",
//                    h.getDia(), h.getMes(), h.getAno()));
//        }

    }

//    CLASSE QUE EXIBE O EXTRATO -->
    public void exibirExtrato() {
        System.out.println("\n Gerando extrato....");
        System.out.println(String.format(
                    "__________________________________________________________"
                + "\n----------------------- EXTRATO --------------------------"
                + "\n Titular:  " + getTitular()
                + "\n Operações: " + getOcorrencia()
                + "\n----------------------------------------------------------"
                + "\n                             Saldo em conta: %.2f"
                + "\n----------------------------------------------------------"
                + "\n-------------------- FIM DO EXTRATO ----------------------\n"       
                +   "__________________________________________________________\n \n", getSaldo()));
    }

//GET E SET
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public List<Historico> getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(List<Historico> ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

}
