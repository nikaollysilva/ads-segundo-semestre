
package com.mycompany.help;

/**
 *
 * @author diego
 */
public class Endereco {

    private String rua;
    private String bairro;
    private Integer numero;
    private String cidade;

    public Endereco(String rua, String bairro, Integer numero, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
    }
    
    public void exibeEndereço(){
        System.out.println(String.format("Rua: %s", this.rua));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Bairro: %s", this.bairro));
        System.out.println(String.format("Cidade: %s", this.cidade));
    }

    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }    
}
