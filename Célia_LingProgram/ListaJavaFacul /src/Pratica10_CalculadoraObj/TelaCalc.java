package Pratica10_CalculadoraObj;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalc {
    private JTextField inputNum1;
    private JTextField inputNum2;
    private JButton btnMais;
    private JButton btnDiv;
    private JButton btnMenos;
    private JButton btnMult;
    private JLabel txtResult;
    private javax.swing.JPanel JPanel;

    Calculadora calculadora1 = new Calculadora();

    public TelaCalc() {
        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora1.setA(inputNum1.getText());
                calculadora1.setB(inputNum2.getText());
                calculadora1.somar();
                txtResult.setText(calculadora1.getResult().toString());
            }
        });
        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora1.setA(inputNum1.getText());
                calculadora1.setB(inputNum2.getText());
                calculadora1.subtrair();
                txtResult.setText(calculadora1.getResult().toString());
            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora1.setA(inputNum1.getText());
                calculadora1.setB(inputNum2.getText());
                calculadora1.multiplicar();
                txtResult.setText(calculadora1.getResult().toString());
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora1.setA(inputNum1.getText());
                calculadora1.setB(inputNum2.getText());
                calculadora1.dividir();
                txtResult.setText(calculadora1.getResult().toString());
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaCalc");
        frame.setContentPane(new TelaCalc().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
