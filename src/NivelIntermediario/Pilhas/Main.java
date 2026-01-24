package NivelIntermediario.Pilhas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estaticos e tem ref de memoria
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas
        // São dinamicas e tamanho aumenta e diminui conforme precisa
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        System.out.println("Minha Stack Atual = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack Atualizada com pop = " + ninjaStack);
        System.out.println("Minha Stack com o proximo elemento do topo = " + ninjaStack.peek());
        System.out.println("Tamanho da Stack " + ninjaStack.size());


    }
}
