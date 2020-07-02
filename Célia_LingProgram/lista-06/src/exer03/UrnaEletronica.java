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
public class UrnaEletronica {

    Candidato candidato01 = new Candidato();
    Candidato candidato02 = new Candidato();

    private Integer totalVotos = 0;
    private String mensagemVoto;

    public UrnaEletronica() {
        candidato01.setNome("A");
        candidato02.setNome("B");
    }

    public void votarCandidato01() {
        candidato01.setVotos(candidato01.getVotos() + 1);
        setTotalVotos(getTotalVotos() + 1);
        setMensagemVoto(candidato01.getNome() + " recebeu 1 voto,totalizando: " + candidato01.getVotos() + " votos.");
        System.out.println(getMensagemVoto());
    }

    public void votarCandidato02() {
        candidato02.setVotos(candidato02.getVotos() + 1);
        setTotalVotos(getTotalVotos() + 1);
        setMensagemVoto(candidato02.getNome() + " recebeu 1 voto,totalizando: " + candidato02.getVotos() + " votos.");
        System.out.println(getMensagemVoto());
    }

    public void encerrarEleicao() {
        if (candidato01.getVotos() > candidato02.getVotos()) {
            setMensagemVoto(candidato01.getNome() + " venceu.");
        } else if (candidato02.getVotos() > candidato01.getVotos()) {
            setMensagemVoto(candidato02.getNome() + " venceu.");
        } else {
            setMensagemVoto("Empate. Refazer eleição.");
        }

        System.out.println("\n Eleição encerrada! \n "
                + "------------------------------ \n"
                + "Total de votos: " + getTotalVotos() + "\n"
                + getMensagemVoto());
    }

//   GET E SET  
    public Integer getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(Integer totalVotos) {
        this.totalVotos = totalVotos;
    }

    public String getMensagemVoto() {
        return mensagemVoto;
    }

    public void setMensagemVoto(String mensagemVoto) {
        this.mensagemVoto = mensagemVoto;
    }

    private Integer votosInteger01 = candidato01.getVotos();
    private Integer votosInteger02 = candidato02.getVotos();
    private Integer votosTotais = getTotalVotos();

    public Integer getVotosInteger01() {
        return votosInteger01;
    }

    public void setVotosInteger01(Integer votosInteger01) {
        this.votosInteger01 = votosInteger01;
    }

    public Integer getVotosInteger02() {
        return votosInteger02;
    }

    public void setVotosInteger02(Integer votosInteger02) {
        this.votosInteger02 = votosInteger02;
    }

    public Integer getVotosTotais() {
        return votosTotais;
    }

    public void setVotosTotais(Integer votosTotais) {
        this.votosTotais = votosTotais;
    }

}
