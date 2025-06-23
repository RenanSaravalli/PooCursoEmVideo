package Aula13;

public class Mamifero extends Animal{
    protected String corPelo;

    // Sobreposição do métod
    @Override
    public void emitirSom() {
        System.out.println("Som do mamífero");
    }
}
