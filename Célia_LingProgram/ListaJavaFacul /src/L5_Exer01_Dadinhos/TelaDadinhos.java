package L5_Exer01_Dadinhos;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDadinhos extends Dadinho {
    private javax.swing.JPanel JPanel;
    private JLabel lblDadinho02;
    private JLabel lblDadinho01;
    private JLabel lblTotalVitorias01;
    private JLabel lblTotalVitorias02;
    private JButton btnSortear;
    private JLabel lblResult;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exer01_TelaDadinhos");
        frame.setContentPane(new TelaDadinhos().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Dadinho dadinho01 = new Dadinho();
    Dadinho dadinho02 = new Dadinho();

    public TelaDadinhos() {
        btnSortear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dadinho01.jogarDado();
                lblDadinho01.setText(dadinho01.numeroSorteado.toString());
                dadinho02.jogarDado();
                lblDadinho02.setText(dadinho02.numeroSorteado.toString());

                if (dadinho01.numeroSorteado > dadinho02.numeroSorteado){
                    lblResult.setText("Dadinho 01 venceu!");
                    vitorias01++;
                    lblTotalVitorias01.setText(vitorias01.toString());
                }else if (dadinho01.numeroSorteado == dadinho02.numeroSorteado){
                    lblResult.setText("Empatou");
                }else {
                    lblResult.setText("Dadinho 02 venceu!");
                    vitorias02++;
                    lblTotalVitorias02.setText(vitorias02.toString());
                }
            }
        });
    }

}
