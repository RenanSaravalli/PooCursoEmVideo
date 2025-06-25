package Aula14;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];
        v[0] = new Video("Musica Caipira");
        v[1] = new Video("ROck LEe VS Gaara ao som de Linkin Park");
        v[2] = new Video("Serie minecraft");

        Gafanhato[] g = new Gafanhato[2];

        g[0] = new Gafanhato("Renan", 19, "M", "re");
        g[1] = new Gafanhato("Ana", 19, "F", "Aninha");

        System.out.println("---- Vídeos ----");
        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);

        System.out.println(" ");

        System.out.println("---- Gafanhotos ----");
        System.out.println(g[0]);
        System.out.println(g[1]);
    }


}
