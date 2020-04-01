package Pratica08_AbrirAuto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAtividade {
    private JPanel panel1;
    private JButton btnMensagem;
    private JLabel txtMensagem;

    public static void Start() {
        JFrame frame = new JFrame("TelaAtividade");
        frame.setContentPane(new TelaAtividade().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TelaAtividade() {

        btnMensagem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMensagem.setText("Arrasou vc é linda!!");
            }
        });
    }
}
