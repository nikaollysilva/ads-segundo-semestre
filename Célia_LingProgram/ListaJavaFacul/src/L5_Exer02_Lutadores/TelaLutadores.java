package L5_Exer02_Lutadores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLutadores extends Lutador {
    private JButton btnForca01;
    private JButton btnForca02;
    private JLabel lblStatus01;
    private JLabel lblStatus02;
    private JLabel lblNome01;
    private JLabel lblNome02;
    private JProgressBar prg01;
    private JProgressBar prg02;
    private JButton btnApanhar01;
    private JButton btnApanhar02;
    private javax.swing.JPanel JPanel;

    Lutador L1 = new Lutador();
    Lutador L2 = new Lutador();


    void desabilitarBtn() {
        btnApanhar01.setEnabled(false);
        btnApanhar02.setEnabled(false);
        btnForca01.setEnabled(false);
        btnForca02.setEnabled(false);
    }

    void mostrarInf() {
        prg01.setValue(L1.getVida());
        prg02.setValue(L2.getVida());
        lblStatus01.setText(L1.status);
        lblStatus02.setText(L2.status);
    }

    void alterarCaracteristicas() {
        L1.setNome("Giovanni");
        lblNome01.setText(L1.getNome());

        L2.setNome("Daniel");
        lblNome02.setText(L2.getNome());

        L1.gerarStatus();
        L2.gerarStatus();

        mostrarInf();

        if (L1.getVida() <= 0) {
            L1.setStatus("Perdeu");
            L2.setStatus("Venceu");
            mostrarInf();
            desabilitarBtn();
        }
        if (L2.getVida() <= 0) {
            L2.setStatus("Perdeu");
            L1.setStatus("Venceu");
            mostrarInf();
            desabilitarBtn();
        }

    }

    public TelaLutadores() {
        btnApanhar01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.apanhar();
                alterarCaracteristicas();
                mostrarInf();
            }
        });
        btnForca01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L1.concentrarEnergia();
                mostrarInf();

            }
        });
        btnApanhar02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L2.apanhar();
                alterarCaracteristicas();
                mostrarInf();

            }
        });
        btnForca02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                L2.concentrarEnergia();
                mostrarInf();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exer02_TelaLutadores");
        frame.setContentPane(new TelaLutadores().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
