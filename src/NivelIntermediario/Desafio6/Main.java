package NivelIntermediario.Desafio6;

import NivelIntermediario.ClassesAbstratasXInterfaces.Ninjas;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Iniciar uma Linked list com 7 ninjas
        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        // Adicionar os ninjas na minha Linked List
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Folha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 18, "Folha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Folha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Folha"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Folha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        // Listar os ninjas
        System.out.println("Lista de ninjas: " + listaDeNinjas);

        // O(n)
        for (Ninja ninja : listaDeNinjas){
            System.out.println(ninja);
        }

        // Adicionar o ninja no inicio da lista
        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Folha"));

        System.out.println(listaDeNinjas);

        // Remover o ninja no inicio da List
        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido = " + removido);

        // Listar os ninjas
        for (Ninja listaDeNinjaAtualizada : listaDeNinjas) {
            System.out.println("Lista de Ninja Atualizada = " + listaDeNinjaAtualizada);
        }

        // Procurar um ninja por indice
        Ninja terceiroNinja = listaDeNinjas.get(3);
        System.out.println("Terceiro Ninja = " + terceiroNinja);

    }
}
