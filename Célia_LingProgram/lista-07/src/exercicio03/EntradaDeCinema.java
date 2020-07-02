package exercicio03;

//Escreva uma classe EntradaDeCinema, com os atributos:
//hora (inteiro que representa a hora de exibição do filme)
//sala (inteiro que representa o número da sala)
//valor (inteiro que representa o valor do ingresso)
//nome (String que representa o nome do filme)
//Escreva o método calculaDesconto, que recebe como parâmetro a idade do cliente 
//e se ele é ou não estudante (parâmetro do tipo boolean). 
//Se ele for menor do que 12 anos, independente de ser ou não estudante, deve ter
//um desconto de 50% sobre o valor normal.
//Se ele for estudante e tiver idade acima de 12, até 15 anos, deve ser dado um desconto de 40%. 
//Se ele for estudante e tiver idade acima de 16 a 20 anos, deve ser dado um desconto de 30%. 
//Se ele for estudante e tiver idade acima de 20 anos, deve ser dado um desconto de 20%.

//Esse método deve atualizar o atributo valor. Escreva o método calculaDescontoHorario, 
//que aplica um desconto de 10% sobre o valor final obtido acima, caso o horário
//do filme seja antes das 16 horas. Escreva o programa que testa essa classe, e 
//imprima o ingresso para os clientes. Teste os diversos casos de descontos.
/**
 *
 * @author Nikaolly
 */
public class EntradaDeCinema {

    private Integer hora;
    private Integer sala;
    private Double valor;
    private String nome;

    public EntradaDeCinema(Integer hora, Integer sala, Double valor, String nome) {
        this.hora = hora;
        this.sala = sala;
        this.valor = valor;
        this.nome = nome;
    }

    public void calculaDesconto(Integer idade, Boolean estudante) {
        System.out.println("----------------------------------------------------\n"
                + "Verificando possiveis descontos...");
        Double desconto;
        
        if (idade < 12) {
            desconto = 0.5;
        } else {
            if (estudante.equals(true)) {
                if (idade <= 15) {
                    desconto = 0.4;
                } else if (idade < 20) {
                    desconto = 0.3;
                } else {
                    desconto = 0.2;
                }
                Double valorDesconto = getValor() * desconto;
                setValor(getValor() - valorDesconto);
                System.out.println(String.format("Desconto de estudante: R$%.2f", valorDesconto));
            } else {
                System.out.println("Nenhum desconto disponível.. :(");
            }
        }      
        calculaDescontoHorario(getHora());
    }

    private void calculaDescontoHorario(Integer horario){
        if(horario < 16){
            Double valorDesconto = getValor() * 0.1;
            setValor(getValor() - valorDesconto);
            System.out.println(String.format("Desconto devido o Horario: R$%.2f", valorDesconto));
        }
        System.out.println("----------------------------------------------------");
    }
    
    public void gerarBilhete(){
        System.out.println(String.format(""
                + "____________________________________________________________\n"
                + "                         BILHETE!                           \n "
                + "Filme: %s.                                                  \n"
                + " Horario: %d:00h      Sala: %d                              \n"
                + "                                 Valor total: R$%.2f        \n"
                + "____________________________________________________________", getNome(), getHora(),getSala(),getValor()));
    }
//    GET E SET
    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala(Integer sala) {
        this.sala = sala;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
