package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
    // Tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUpperCase vai colocar tudo em CAPSLOCK
        System.out.println(nomeUpperCase);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // ToLowerCasw vai colocar tudo em caixa baixa
        System.out.println(aldeiaLowerCase);
    }
}
