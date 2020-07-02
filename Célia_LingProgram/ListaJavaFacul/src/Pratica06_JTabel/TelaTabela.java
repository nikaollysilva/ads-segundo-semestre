package Pratica06_JTabel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTabela {


    private JPanel JPanel;
    private JTable jTProdutos;
    private JTextField txtDescricao;
    private JTextField txtQtd;
    private JTextField txtValor;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnAlterar;
    private JLabel txtTeste;

    ProdutoTableModel tableModel = new ProdutoTableModel();

    public TelaTabela() {
        jTProdutos.setModel(tableModel);

//Testando uma coisinha...>>>
//        Integer a = colunas.length;
//        Integer b = dados.size();
//        txtTeste.setText(b.toString())
//        txtTeste.setText(btnSalvar.getText());
//        >>>
        
        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Produto p = new Produto();
                p.setDescricao(txtDescricao.getText());
                p.setQtd(Integer.parseInt(txtQtd.getText()));
                p.setValor(Double.parseDouble(txtValor.getText()));

                tableModel.addLinha(p);
            }
        });
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                Sabendo se esta selecionado, pois quando a tabela nao tem nada selecionado ela retorna o -1.
                if (jTProdutos.getSelectedRow() != -1){
                    tableModel.removaLinha(jTProdutos.getSelectedRow());
                }
            }
        });
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTProdutos.getSelectedRow() != -1){
                    tableModel.setValueAt(txtDescricao.getText(), jTProdutos.getSelectedRow(), 0);
                    tableModel.setValueAt(txtQtd.getText(), jTProdutos.getSelectedRow(), 1);
                    tableModel.setValueAt(txtValor.getText(), jTProdutos.getSelectedRow(), 2);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaTabela");
        frame.setContentPane(new TelaTabela().JPanel);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
