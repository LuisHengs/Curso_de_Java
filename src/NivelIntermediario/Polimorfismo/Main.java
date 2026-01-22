package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        // Obj ninja não da para ser criado por que é abstrato

        // Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 18, NivelNinja.GENIN, Bijus.KURAMA);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println("-------");
        naruto.tacarKunai();
        System.out.println(naruto.altura);
        System.out.println("-------");

        Anbu ninjaAnbu;
        ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja Aleatorio";
        System.out.println("-------");

        System.out.println(naruto);

        // Obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        System.out.println(sasuke);

        // Obj Uchiha 2
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27);
        itachi.habilidadeEspecial();

        //Obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        //metodo comum
        madara.inteligenciaDeCombate();
        //metodo sobrecarregado
        madara.inteligenciaDeCombate(180);

    }
}
