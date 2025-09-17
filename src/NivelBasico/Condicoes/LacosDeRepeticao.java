package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repetição: Vão repetir infinitamente ou até você atingir o parametro desejado
        * WHILE = FOR
        * */

        // While
        // while (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR

        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("O Naruto esta se clonando e ja se clonou " + i);
        }



    }
}
