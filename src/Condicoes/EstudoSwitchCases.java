package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar cases especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * switchCase
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opções para o usuario
        System.out.println("Escolha um persornagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedir para o ususario escolher um das opções
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        // Reação ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno, a personagem feminina mais legal");
                break;
            default:
                System.out.println("Você não digitou uma resposta valida! Tente denovo");
        }

        // Fechar a caixa
        scanner.close();
    }
}
