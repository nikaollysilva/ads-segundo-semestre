package com.monitoramento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class statusBar {
    private JProgressBar prgCpu;
    private JProgressBar prgMemoria;
    private JProgressBar prgDisco;
    private JButton atualizarButton;
    private JButton atualizarAutomaticamenteButton;
    private JPanel JPanel;
    private JButton btnCancel;

    Random aleatorio = new Random();
    Timer timer = new Timer();

    public void gerarNumeros() {

        Integer cpu = aleatorio.nextInt(101);
        Integer memoria = aleatorio.nextInt(101);
        Integer disco = aleatorio.nextInt(101);

        prgCpu.setValue(cpu);
        prgMemoria.setValue(memoria);
        prgDisco.setValue(disco);
    }

    public void time(){
        int delay = 500;
        int interval = 500;
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                gerarNumeros();
            }
        }, delay, interval);
    }

    public statusBar() {

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarNumeros();
            }
        });

        atualizarAutomaticamenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              time();
              atualizarButton.setEnabled(false);
              atualizarAutomaticamenteButton.setEnabled(false);
            }
        });
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timer.cancel();
                atualizarButton.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("statusBar");
        frame.setContentPane(new statusBar().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



