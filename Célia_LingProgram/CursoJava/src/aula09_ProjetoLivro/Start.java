package aula09_ProjetoLivro;

public class Start {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Maria", 25, "Feminino");

        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0] );
        l[1] = new Livro("POO para Iniciantes","Pedro paulo", 500,p[1]);
        l[2]= new Livro("Java Avançado", "Maria Candida", 800, p[0]);

        l[0].abrir();
        l[0].folhear(300);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
    }
}
