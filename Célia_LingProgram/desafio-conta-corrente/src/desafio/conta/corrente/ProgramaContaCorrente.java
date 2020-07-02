package desafio.conta.corrente;

/**
 *
 * @author Nikaolly
 */
public class ProgramaContaCorrente {

    public static void main(String[] args) {
//        CRIANDO DOIS OBJETOS DA CLASSE CONTACORRENTE
        ContaCorrente c1 = new ContaCorrente("John Wich", 1000.00);
        ContaCorrente c2 = new ContaCorrente("Jane Doe", 1000.00);
        
//        DEPOSITANDO 
        c1.depositar(100.00);
        c1.depositar(100.00);
//        SACANDO e EXIBINDO O EXTRATO
        c1.sacar(20.00);
        c1.exibirExtrato();

//        DEPOSITANDO
        c2.depositar(120.00);
//     
//        SACANDO
        c2.sacar(20.00);
        c2.sacar(80.00);
        c2.sacar(1000.00);

   
//        ESSE COMANDO NAO SERA EXECUTADO DEVISO A MINHA VALIDACAO DE Saque de SALDO
        c2.sacar(20.01);
//        
//        EXIBINDO O EXTRATO
        c2.exibirExtrato();
//        
    }
//FIM DO CODIGO
}
