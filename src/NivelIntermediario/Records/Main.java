package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("cadastro = " + cadastro);
        System.out.println("Nome do cadastro = " + cadastro.getNome());

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke",  88888888);
        System.out.println("cadastroUsandoRecord = " + cadastroUsandoRecord);

    }
}
