package Entregavel_Exer01_Monitoramento;

//Opção 1: Simulador de monitoramento de SO
//        Tela única com as porcentagens de uso de CPU, Memória e Disco.
//        Os valores das porcentagens são gerados aleatoriamente ao clicar num botão "Atualizar", abaixo das medidas.
//        Tentar dar uma aparência pelo menos "boa" para a tela (fontes, cores etc)

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TelaMonitoramento extends JFrame {
    private JProgressBar prgCpu;
    private JProgressBar prgMemoria;
    private JProgressBar prgDisco;
    private JButton btnCancel;
    private JButton atualizarAutomaticamenteButton;
    private JButton atualizarButton;
    private javax.swing.JPanel JPanel;

    Random aleatorio = new Random();
    java.util.Timer timer = new Timer();

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

    public TelaMonitoramento() {

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

   public static void start(){
      JFrame frame = new JFrame("TelaMonitoramento");
      frame.setContentPane(new TelaMonitoramento().JPanel);
      frame.setSize(500,250);
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      frame.setLocation(dim.width / 2 - frame.getSize().width/2, dim.height / 2 - frame.getSize().height/2);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
  }


}
