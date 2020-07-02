package com.mycompany.nikolly.santos.c3;

/**
 *
 * @author Nikaolly
 */
public class VeterinarioCirurgiao extends VeterinarioClinico {

//    ATRIBUTOS
    private Integer qtdCirurgia;
    private Double valorCirurgia;

//    CONSTRUTOR
    public VeterinarioCirurgiao(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta, Integer qtdCirurgia, Double valorCirurgia) {
        super(codigo, nome, qtdConsulta, valorConsulta);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
    }

//    METODO SOBRESCRITO
    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + (qtdCirurgia * valorCirurgia);
    }

//    TOSTRING
    @Override
    public String toString() {
        //    Optei por não chamar o super.toString para deixar melhor formatado
        return String.format("----------------------------------------------------------------\n"
                + "| Folha de pagamento: \n"
                + "| Código(CRMV):" + getCodigo() + "\n"
                + "| Nome: " + getNome() + "\n"
                + "| Função(s): Veterinário Clínico e Cirurgião \n"
                + "| Quantidade de Consultas: " + getQtdConsulta() + "\n"
                + "| Valor da Consulta(unidade): " + getValorConsulta() + "\n"
                + "| Quantidade de Cirurgias: " + getQtdCirurgia() + "\n"
                + "| Valor da Cirurgia(unidade): " + getValorCirurgia() + "\n"
                + "| Salário Líquido: R$ %.2f \n"
                + "----------------------------------------------------------------",
                calcularSalario());
    }

//    GET´S e SET´S
    public Integer getQtdCirurgia() {
        return qtdCirurgia;
    }

    public void setQtdCirurgia(Integer qtdCirurgia) {
        this.qtdCirurgia = qtdCirurgia;
    }

    public Double getValorCirurgia() {
        return valorCirurgia;
    }

    public void setValorCirurgia(Double valorCirurgia) {
        this.valorCirurgia = valorCirurgia;
    }

}
