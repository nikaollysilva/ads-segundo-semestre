package com.mensager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button_msg;
    private JPanel panelMain;
    private JLabel txtmessagem;

    public App() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"Hello World");
                txtmessagem.setText("Leo é feio, " +
                        "porem é do exercito e vai ficar rico," +
                        "ai vai ter varias muie");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
