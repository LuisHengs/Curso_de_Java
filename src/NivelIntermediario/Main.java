package NivelIntermediario;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 16;
        String missao = "Encontrar o bandido";
        String statusMissao = "Em andamento";
        char nivelDaMissao = 'A';

        //Verificar nivel da missao e idade do ninja
        if (idade < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusMissao = "Concluida";
            } else {
                statusMissao = "Não concluida";
            }
        } else {
            statusMissao = "Concluida";
        }

        System.out.println("---------------------");

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Status da Missao: " + statusMissao);
        System.out.println("Nivel da Missao: " + nivelDaMissao);

        System.out.println("---------------------");

        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 16;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Missao concluida";
            } else {
                statusDaMissao2 = "Missao não concluida";
            }
        } else {
            statusDaMissao2 = "Missao concluida";
        }

        System.out.println("---------------------");

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da Missao: " + statusDaMissao2);
        System.out.println("Nivel da Missao: " + nivelDaMissao2);

        System.out.println("---------------------");

        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 16;
        String missao3 = "Curar Feridos da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'D';

        System.out.println("---------------------");

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da Missao: " + statusDaMissao3);
        System.out.println("Nivel da Missao: " + nivelDaMissao3);

        System.out.println("---------------------");
    }
}
