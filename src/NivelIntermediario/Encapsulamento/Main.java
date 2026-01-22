package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("------ Naruto Uzumaki ------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 17, 30, 1.67);
        System.out.println(naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println(naruto.getNome());

        System.out.println("------ Sasuke Uchiha ------");





    }
}
