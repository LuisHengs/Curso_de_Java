package NivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        // Array
        // São estaticos, não alteram de tamanho
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        System.out.println("Printando Array = " + ninjasArray[0]);

        // Listas
        // Listas não são estaticas, elas podem aumentar ou diminuir
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        //Adicionar na lista
        ninjasList.add("Kakashi Hatake");

        System.out.println("ninjasList = " + ninjasList);

        // Remover da lista
        ninjasList.remove("Kakashi Hatake");
        System.out.println("ninjasList = " + ninjasList);

        // Trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("ninjasList = " + ninjasList);

        // Ver tamanho da Lista
        System.out.println("Tamanho Lista = " + ninjasList.size());
    }
}
