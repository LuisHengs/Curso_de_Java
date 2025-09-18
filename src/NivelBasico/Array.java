package NivelBasico;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referencia!
        // String inicializam como null
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        // Redeclarar o ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[0]);

        // For para fazer um LOOP no array

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        /* Redeclarar
        String nomeNinja = "Naruto Uzumaki";
        nomeNinja = "Boruto Uzumaki";
        System.out.println(nomeNinja);
         */

        // Int inicializam como 0
        int[] idade = new int[3];
        System.out.println(idade[1]);

        // Boolean inicializam como FALSE
        boolean[] verdadeioOuFalso = new boolean[1];
        System.out.println(verdadeioOuFalso[0]);

        // Doubles inicializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


        String nomeDoNinja1 = "Gaara do deserto";
        String nomeDoNinja2 = "Rock Lee";
    }
}
