package Pratica04_ContaCorrente;

public class ContaCorrente {

    //   "", Caracteristicas
    Double saldo = 0.0;
    String frase;
    Integer transacoes = 0;

    //    Metodos, funcoes
    void sacar() {
        if ((saldo - 50) >= 0) {
            saldo -= 50;
            frase = "Saque efetuado";
            transacoes++;
        } else {
            frase = "Impossivel sacar, saldo insuficiente";
        }
    }

    void depositar() {
        saldo += 50;
        frase = "Deposito efetuado";
        transacoes++;
    }

    //  GET/SET
    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getTransacoes() {
        return this.transacoes;
    }

    public void setTransacoes(Integer transacoes) {
        this.transacoes = transacoes;
    }
}
