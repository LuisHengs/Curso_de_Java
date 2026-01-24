package NivelIntermediario.Genericos;

public class Main {

    public static void main(String[] args) {

        EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken = new EquipamentosNinja("Shuriken");
        EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

        BolsaGenerecia<EquipamentosNinja> bolsaGenerecia = new BolsaGenerecia<>();
        bolsaGenerecia.adicionarEquipamento(kunai);
        bolsaGenerecia.adicionarEquipamento(shuriken);
        bolsaGenerecia.adicionarEquipamento(pergaminho);

        System.out.println(bolsaGenerecia);

    }

}
















// Metodo sem ser generico
 /*public static void main(String[] args) {

        Kunai kunai1 = new Kunai("Kunai normal");
        Kunai kunai2 = new Kunai("Kunai explosiva");
        Kunai kunai3 = new Kunai("Kunai de agua");

        BolsaKunai bolsaKunai = new BolsaKunai();
        bolsaKunai.adicionarKunai(kunai2);
        System.out.println(bolsaKunai);

    }*/