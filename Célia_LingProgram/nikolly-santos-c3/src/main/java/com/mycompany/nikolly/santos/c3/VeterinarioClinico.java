package com.mycompany.nikolly.santos.c3;

/**
 *
 * @author Nikaolly
 */
public class VeterinarioClinico {

//    ATRIBUTOS
    protected Integer codigo;
    protected String nome;
    protected Integer qtdConsulta;
    protected Double valorConsulta;

//    CONSTRUTOR
    public VeterinarioClinico(Integer codigo, String nome, Integer qtdConsulta, Double valorConsulta) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }

//    METODOS
    public Double calcularSalario() {
        return qtdConsulta * valorConsulta;
    }

//    TOSTRING
    @Override
    public String toString() {
        return String.format("----------------------------------------------------------------\n"
                + "| Folha de pagamento:\n"
                + "| Código(CRMV):" + codigo + "\n"
                + "| Nome: " + nome + "\n"
                + "| Função(s): Veterinário Clínico\n"
                + "| Quantidade de Consultas: " + qtdConsulta + "\n"
                + "| Valor da Consulta(unidade):" + valorConsulta + "\n"
                + "| Salário Líquido: R$ %.2f \n"
                + "----------------------------------------------------------------", calcularSalario());
    }

//    GET´S E SET´S
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public void setQtdConsulta(Integer qtdConsulta) {
        this.qtdConsulta = qtdConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(Double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

}
