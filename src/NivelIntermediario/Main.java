package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja Naruto - Naruto é um OBJETO
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        //Ninja Naruto = new Ninja();
        //Naruto.nome = "Naruto Uzumaki";
        //Naruto.aldeia = "Aldeia da folha";
        //Naruto.idade = 17;

        // Criar ninja Sasuke Uchiha - Sasuke é um OBJETO
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        //Ninja Sasuke = new Ninja();
        //Sasuke.nome = "Sasuke Uchiha";
        //Sasuke.aldeia = "Aldeia da Folha";
        //Sasuke.idade = 18;

        // Criar ninja Sakura Haruno - Haruno é um OBJETO
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        //Ninja Sakura = new Ninja();
        //Sakura.nome = "Sakura Haruno";
        //Sakura.aldeia = "Aldeia da Folha";
        //Sakura.idade = 18;

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 16;
        Hinata.ativarByakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

        // Aplicando Metodos aos meus objetos
        //Sasuke.SharinganAtivado();
        //String chamandoMetodo = Sasuke.EuSouUmNinja();
        //System.out.println(chamandoMetodo);

        //int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        //System.out.println("Você tem: " + Sasuke.idade + " então falta no minimo: " + quantoTempoFalta + " anos para você se tornar Hokage");

    }
}
