/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03;

/**
 *
 * @author Nikaolly
 */
public class UrnaEletronica2 {
    private Integer votosCandidato = 0;
    private String nome;
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Integer getVotosCandidato() {
        return votosCandidato;
    }

    public void setVotosCandidato(Integer votosCandidato) {
        this.votosCandidato = votosCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void votar(){
        setVotosCandidato(getVotosCandidato() + 1);
    }
}
