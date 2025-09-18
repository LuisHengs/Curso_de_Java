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
