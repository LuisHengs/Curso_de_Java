package NivelIntermediario.AulaBonus;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Arrays
        String[] nomeNinjaArray = new String[3];

        System.out.println("---------------- ARRAY ----------------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("nomeNinjaArray = " + nomeNinjaArray);
        System.out.println("nomeNinjaArray = " + nomeNinjaArray[0]);

        // Lista é um pouco mais lenta em comparação com ARRAY
        System.out.println("---------------- LISTA ---------------------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuku Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println(nomeNinjaList);

        System.out.println("---------------- STACKS --------------------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println("Mostrar Stack = " + nomeNinjaStack);
        System.out.println("Tirar da pilha/stack = " +nomeNinjaStack.pop());
        System.out.println("Ninja no topo (sem remover): " + nomeNinjaStack.peek());







        /*
        * 1) Arrays são estaticos
        *       Exigem um tamanho pré definido
        *
        * 2) Listas são dinamicas
        *       Aumentam e diminuem de tamanho conforme precisamos
        *
        * 3) Stacks são unicos
        *       Exigem uma ordem! O último a entrar é o primeiro a sair!
        * */

    }
}
