package NivelIntermediario.Polimorfismo;

public class Uzumaki extends Ninja {

    Bijus bijus;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank, Bijus bijus) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.bijus = bijus;
    }

    // Sobreescrever o metodo da classe ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uzumaki, um ataque de ar. Eu ja completei: " + numeroDeMissoesConcluidas + " missões");
    }

    /*@Override
    public void tacarKunai() {
        System.out.println("EU SOU UM METODO DA CLASSE FILHA");
    }*/
}
