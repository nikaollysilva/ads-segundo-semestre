package Pratica05_Carro;

//Crie uma classe Carro(voce decide os atributos e metodos necessarios).
//Em seguida crie um JFrame para que o usuario possa manipular essa classe.
//Esse Jframe devera ter:
//Botao Acelerar;
//Botao Frear;
//Botao Ligar;
//Botao Desligar;
//Label ligado(indica se o carro esta ligado ou nao);
//Label velocidade(indica a velocidade atual do carro);
//
//O carro nao podera acelerar ou frear caso esteja desligado.
//A velocidade maxima permitida é de 120km/h.
//Ao desligar, a velocidade deve ser zerada e o status devera mostrar "Desligado";

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCarro extends Carro {
    private JButton acelerarButton;
    private JButton frearButton;
    private JButton ligarButton;
    private JButton desligarButton;
    private JProgressBar prgGasolina;
    private javax.swing.JPanel JPanel;
    private JLabel txtVelocidade;
    private JLabel txtLigDes;
    private JLabel txtMensagem;
    private JLabel txtStatusGasolina;
    private JButton btnAbastecer;

    Carro carroAmarelo = new Carro();

    public TelaCarro() {
      AttInformacoes();

        acelerarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carroAmarelo.acelerar();
                AttInformacoes();
            }
        });
        frearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carroAmarelo.frear();
                AttInformacoes();
            }
        });
        ligarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carroAmarelo.ligar();
                AttInformacoes();
            }
        });
        desligarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carroAmarelo.desligar();
                AttInformacoes();
            }
        });


        btnAbastecer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carroAmarelo.abastecer();
                AttInformacoes();
            }
        });
    }

    void AttInformacoes(){

        txtStatusGasolina.setText(carroAmarelo.statusGasolina);
        txtStatusGasolina.setForeground(Color.decode(carroAmarelo.getColorGasolina()));

        txtVelocidade.setText(carroAmarelo.getVelocidade().toString());
        Integer value = carroAmarelo.getGasolina().intValue();
        prgGasolina.setValue(value);

        txtLigDes.setText(carroAmarelo.getStatus());
        txtLigDes.setForeground(Color.decode(carroAmarelo.getColorStatus()));
        txtMensagem.setText(carroAmarelo.getMensagem());
        txtMensagem.setForeground(Color.decode(carroAmarelo.getColorMensagem()));

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaCarro");
        frame.setContentPane(new TelaCarro().JPanel);
        frame.setSize(500,500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width/2, dim.height / 2 - frame.getSize().height/2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
