package Pratica06_JTabel;


import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ProdutoTableModel extends AbstractTableModel {

    public List<Produto> dados = new ArrayList<>();
    public String[] colunas = {"Descrição", "QTD", "Valor"};

    //    Dando nome ao scroolbar, lembre-se de habilitar o scrool ao inserir a o Jtable
    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

    //    pegando o numero de linhas
    @Override
    public int getRowCount() {
        return this.dados.size();
    }

    //    pegando o numero de colunas
    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    //    colocando cada dado em seu devido lugar
    @Override
    public Object getValueAt(int linhaIndex, int colunaIndex) {

        switch (colunaIndex) {
            case 0:
                return this.dados.get(linhaIndex).getDescricao();
            case 1:
                return this.dados.get(linhaIndex).getQtd();
            case 2:
                return this.dados.get(linhaIndex).getValor();
        }
        return null;
    }


//    fazendo a alteracao de informacoes
    @Override
    public void setValueAt(Object valor, int linhaIndex, int colunaIndex) {
        switch (colunaIndex) {
            case 0:
                dados.get(linhaIndex).setDescricao((String) valor);
                break;
            case 1:
                this.dados.get(linhaIndex).setQtd(Integer.parseInt((String) valor));
                break;
            case 2:
                this.dados.get(linhaIndex).setValor(Double.parseDouble((String) valor));
                break;
        }
        this.fireTableRowsUpdated(linhaIndex,linhaIndex);
    }

    //    addRow
    public void addLinha(Produto p) {
        this.dados.add(p);
//        Atualizando tabela
        this.fireTableDataChanged();
    }

    //    removeRow
    public void removaLinha(int linhaIndex) {
        this.dados.remove(linhaIndex);
//        atualilizando a tabela, esse comando é especifico para delete
        this.fireTableRowsDeleted(linhaIndex, linhaIndex);
    }


}
