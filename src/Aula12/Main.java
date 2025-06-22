package Aula12;

public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35.5f);
        m.setCorPelo("MArrom");
        m.locomover();
        m.emitirSom();

        System.out.println("--------------------------");

        r.locomover();
        r.emitirSom();

        System.out.println("-----------------------");

        p.locomover();
        p.emitirSom();

        System.out.println("-------------------------------------");

        a.locomover();
        a.emitirSom();
    }
}
