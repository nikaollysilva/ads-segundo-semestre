package Pratica04_ContaCorrente;


//Crie uma classe para gerenciar uma conta corrente (voce decide os atributos e metodos necessarios).
//Em seguida crie um JFrame para usar sua classe, essa tela devera ter os seguintes elementos:

//Botao Sacar 50;
//Botao Depositar 50;
//Label "Saldo"(Saldo atual em conta);
//Label "Operacoes"(Transacoes efetivas realizadas);

//Voce devera contabilizar as operacoes realizadas com sucessos(saque e deposito) e aprensentar para o usuario.
//Ao sacar, nao permita o saldo ficar negativo, ou seja, somente realizar o suficiente.

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContaCorrente extends ContaCorrente{

    private JButton sacarButton;
    private JButton depositarButton;
    private javax.swing.JPanel JPanel;
    private JLabel lblMensagem;
    private JLabel lblSaldo;
    private JLabel lblNome;
    private JLabel lblTrasacoes;

    ContaCorrente conta01 = new ContaCorrente();

    public TelaContaCorrente() {
        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conta01.sacar();
                mostrarInfo();
            }
        });
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conta01.depositar();
                mostrarInfo();
            }
        });
    }

    void mostrarInfo(){

        lblSaldo.setText(conta01.getSaldo().toString());
        lblTrasacoes.setText(conta01.getTransacoes().toString());
        lblMensagem.setText(conta01.getFrase());

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaContaCorrente");
        frame.setContentPane(new TelaContaCorrente().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
