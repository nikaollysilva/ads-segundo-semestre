package Pratica02_MostrarMensagen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMensagem {
    private JLabel txtmessagem;
    private JButton button_msg;
    private javax.swing.JPanel panelMain;

    public TelaMensagem() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"Hello World");
                txtmessagem.setText("Clicou!!");
            }
        });
    }

    public static void StartMensagem(){
        JFrame frame = new JFrame("App");
        frame.setContentPane(new TelaMensagem().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

}
