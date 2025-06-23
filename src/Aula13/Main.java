package Aula13;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.reagir();
        cachorro.reagir("Olá");
        cachorro.reagir("Vai apanhar");
        cachorro.reagir(11, 45);
        cachorro.reagir(19, 00);
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(2,17.5f);
        cachorro.reagir(14,24.4f);
    }
}
