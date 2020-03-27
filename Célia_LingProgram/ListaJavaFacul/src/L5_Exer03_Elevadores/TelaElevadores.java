package L5_Exer03_Elevadores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaElevadores {
    private JPanel JPanel;
    private JLabel lblPeso01;
    private JLabel lblQuant01;
    private JButton btnEntrarCrianca01;
    private JButton btnEntrarMulher01;
    private JButton btnEntrarHomem01;
    private JLabel lblPeso02;
    private JLabel lblQuant02;
    private JButton btnEntrarCrianca02;
    private JButton btnEntrarMulher02;
    private JButton btnEntrarHomem02;

    Exer03_Elevadores Elevador01 = new Exer03_Elevadores();
    Exer03_Elevadores Elevador02 = new Exer03_Elevadores();

    void atualizarInformacoes(){
        lblPeso01.setText("Peso: " + Elevador01.getPesoTotal());
        lblQuant01.setText("Quantidade de pessoas: "+Elevador01.getQuantidadePessoas());

        lblPeso02.setText("Peso: " + Elevador02.getPesoTotal());
        lblQuant02.setText("Quantidade de pessoas: "+Elevador02.getQuantidadePessoas());
    }

    public TelaElevadores() {
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
        frame.setContentPane(new TelaElevadores().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
