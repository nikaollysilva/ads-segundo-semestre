package desafio.conta.corrente;

import java.util.Date;

/**
 *
 * @author Nikaolly
 */
public class Historico {
    Date data = new Date();
//    ATRIBUTOS
    private Integer dia = data.getDate();
    private Integer mes = (data.getMonth()+1);
    private Integer ano = (data.getYear()+ 1900);
    private Double valor;
    private String operacao;

//    CONSTRUTOR

    public Historico( Double valor, String operacao) {
        this.valor = valor;
        this.operacao = operacao;
    }

    
//    ToString
      @Override
    public String toString() {
        return  "\n  Data: " + dia + "/" + mes + "/" + ano + "   Valor: R$" + valor +"  Operação: "+ operacao;
    }

//    GET E SET
    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
    
    
}
