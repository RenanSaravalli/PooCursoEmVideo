package aula07;

public class Main {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[4];
        Luta ufcLuta = new Luta();

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putsript", "Brasil", 29, 1.68f, 57.8f,14,2,3);
        l[2] = new Lutador("Clebinho Som", "Reino Unido", 29, 1.68f, 80.8f,14,2,3);
        l[3] = new Lutador("Rebert Cawboi", "Inglaterra", 29, 1.68f, 80.8f,14,2,3);

        l[0].status();
        l[1].status();
        ufcLuta.marcarLuta(l[2], l[3]);
        ufcLuta.lutar();
    }
}
