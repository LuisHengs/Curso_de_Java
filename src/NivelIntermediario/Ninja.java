package NivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    /*
    * O metodo VOID não retorna valor nenhum!
    * */

    // Criar um metodo Publico personalizado
    public void SharinganAtivado() {
        System.out.println("O sharigan Ativou");
    }

    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja!";
    }

    /*
    * Metodo Int vai ter que retornar um int
    * */
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
