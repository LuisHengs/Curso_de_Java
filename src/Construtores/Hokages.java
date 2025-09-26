package Construtores;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages() {
        // Construtor vazio, sem argumentos
    }

    // Criar um construtor com argumento
    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade){
        this.idade = idade;
    }

    // All args constructor = Construtor com todos os argumentos
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    // Você consegue criar altomaticamente os construtores com intellij (Alt + Insert)
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
