package Lista05;

import Lista01.Exer03_Elevador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exer03_TelaElevadores extends Exer03_Elevadores{
    private JButton btnEntrarCrianca01;
    private JPanel JPanel;
    private JButton btnEntrarHomem01;
    private JButton btnEntrarMulher01;
    private JButton btnEntrarMulher02;
    private JButton btnEntrarHomem02;
    private JButton btnEntrarCrianca02;
    private JLabel lblPeso01;
    private JLabel lblQuant01;
    private JLabel lblPeso02;
    private JLabel lblQuant02;

    Exer03_Elevadores Elevador01 = new Exer03_Elevadores();
    Exer03_Elevadores Elevador02 = new Exer03_Elevadores();

    void atualizarInformacoes(){
        lblPeso01.setText("Peso: " + Elevador01.getPesoTotal());
        lblQuant01.setText("Quantidade de pessoas: "+Elevador01.getQuantidadePessoas());

        lblPeso02.setText("Peso: " + Elevador02.getPesoTotal());
        lblQuant02.setText("Quantidade de pessoas: "+Elevador02.getQuantidadePessoas());
    }

    public Exer03_TelaElevadores() {
        btnEntrarCrianca01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador01.entrarCrianca();
               atualizarInformacoes();
            }
        });
        btnEntrarMulher01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador01.entrarMulher();
                atualizarInformacoes();
            }
        });
        btnEntrarHomem01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador01.entrarHomem();
                atualizarInformacoes();
            }
        });


        btnEntrarCrianca02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador02.entrarCrianca();
                atualizarInformacoes();
            }
        });
        btnEntrarMulher02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador02.entrarMulher();
                atualizarInformacoes();
            }
        });
        btnEntrarHomem02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Elevador02.entrarHomem();
                atualizarInformacoes();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exer03_TelaElevadores");
        frame.setContentPane(new Exer03_TelaElevadores().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
