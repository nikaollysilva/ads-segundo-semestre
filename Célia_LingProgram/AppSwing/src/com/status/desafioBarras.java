package com.status;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class desafioBarras extends Componentes {
    private JPanel Jpanel;
    private JProgressBar prg1;
    private JProgressBar prg2;
    private JProgressBar prg3;
    private JButton btnAtualizar;
    private JLabel lblStatus1;
    private JLabel lblStatus2;
    private JLabel lblStatus3;
    private JButton btnAtualizarAuto;
    private JButton btnCancel;

    Componentes barra01 = new Componentes();
    Componentes barra02 = new Componentes();
    Componentes barra03 = new Componentes();

    Timer temporizador = new Timer();

    public void chamada() {
        barra01.atualizarDados();
        barra01.atualizarStatus();
        prg1.setValue(barra01.valor);
        lblStatus1.setText(barra01.status);
        lblStatus1.setForeground(Color.decode(barra01.cor));


        barra02.atualizarDados();
        barra02.atualizarStatus();
        prg2.setValue(barra02.valor);
        lblStatus2.setText(barra02.status);
        lblStatus2.setForeground(Color.decode(barra02.cor));


        barra03.atualizarDados();
        barra03.atualizarStatus();
        prg3.setValue(barra03.valor);
        lblStatus3.setText(barra03.status);
        lblStatus3.setForeground(Color.decode(barra03.cor));
    }


    public desafioBarras() {

        btnAtualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chamada();
            }
        });

        btnAtualizarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer inicieDepoisDe = 500;
                Integer intervaloDeTempo = 500;

                temporizador.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        chamada();
                    }
                },inicieDepoisDe,intervaloDeTempo);

                btnAtualizarAuto.setEnabled(false);

            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAtualizarAuto.setEnabled(false);
                temporizador.cancel();
            }
        });
    }


    public static void main(String[] args) {
        JFrame Painel = new JFrame("desafioBarras");
        Painel.setContentPane(new desafioBarras().Jpanel);
        Painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Painel.pack();
        Painel.setVisible(true);
    }
}

