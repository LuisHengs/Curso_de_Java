package NivelIntermediario;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        // Array
        String[] ninjaArray = new String[6];

        // Listas
        List<String> ninjaList = new ArrayList<>();

        // Stack
        Stack<String> ninjaStack = new Stack<>();

        // Queue // FILAS
        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashi");
        ninjaQueue.add("Shikamaru");

        // Mostrar a fila
        System.out.println("Ninjas na fila: " + ninjaQueue);

        // Tirar um ninja da fila
        ninjaQueue.poll();
        System.out.println("Ninjas fila depois do poll: " + ninjaQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninja no HEAD: " + ninjaQueue.peek());

        // Adicionar a fila
        ninjaQueue.add("Tobirama Senju");
        ninjaQueue.add("Hashirama Senju");
        System.out.println("Ninjas na fila: " + ninjaQueue);

        // Não da pra deletar o tail

        // Esvaziar fila
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();
        ninjaQueue.poll();

        // Verificar se a fila ta fazia
        if (ninjaQueue.isEmpty()) {
            System.out.println("A fila ta vazia");
        }





    }
}
