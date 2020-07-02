package exer01;

/**
 *
 * @author Nikaolly
 */
public class Clube {

    private String nome;
    private Integer vitorias = 0;
    private Integer derrotas = 0;
    private Integer empates = 0;
    private Integer pontos = 0;
    private String mensagem = "";

    //METODOS
    public void vencer() {
        setVitorias(getVitorias() + 1);
        setPontos(getPontos() + 3);
        setMensagem(" venceu !");
        gerarMensagem();
    }

    public void perder() {
        setDerrotas(getDerrotas() + 1);
        setMensagem(" perdeu... ");
        gerarMensagem();
    }

    public void empatar() {
        setEmpates(getEmpates() + 1);
        setPontos(getPontos() + 1);
        setMensagem(" Empatou!");
        gerarMensagem(); 
    }
    
    public void gerarMensagem(){
        System.out.println(getNome() + getMensagem());
    }

    public void gerarPlacar() {
        System.out.println("____________________________________"
                + "\n Nome do Clube: " + getNome()
                + "\n Vitórias: " + getVitorias()
                + "\n Derrotas: " + getDerrotas()
                + "\n Empates: " + getEmpates()
                + "\n Pontos: " + getPontos());
    }

    //GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
