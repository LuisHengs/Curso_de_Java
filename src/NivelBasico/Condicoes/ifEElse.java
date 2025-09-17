package NivelBasico.Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - CondiçCoões
        * ELSE IF
        * Objetivo: Passar o ninja de nivel de acordo com o número de missões
        * */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        /*
        * if (condicao) {resultado}
        * else if (condicao) {resultado}
        * else {resultado caso nada seja verdadeio}
        * */

        //se (condicao) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }



    }
}
