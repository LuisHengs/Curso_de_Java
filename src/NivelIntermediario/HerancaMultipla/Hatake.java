package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um Hatake");
    }

    // Metodo da interface
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": Eu sou um ninja de elite da Ambu");
    }

    public void hokageAtivo() {
        System.out.println(nome + ": Eu sou um Hokage");
    }
}
