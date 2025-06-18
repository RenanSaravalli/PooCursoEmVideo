package aula09;

public class Main {
    public static void main(String[] args) {
        Livro[] biblioteca = new Livro[3];
        Pessoa renan = new Pessoa("Renan", 19, 'M');
        biblioteca[0] = new Livro("Residencia Malvada", "Violeiro Malvado", 231, 0, false, renan);
        biblioteca[1] = new Livro("Jacare e a Fada", "Cleytin", 312, 0, false, renan);
        biblioteca[2] = new Livro("Ze pedro o Pedreiro e a Donzela", "Violeiro Malvado", 413, 0, false, renan);

        System.out.println("==== Detalhes dos livros da biblioteca ====");
        for (Livro livro : biblioteca) {
            livro.detalhes();
        }

        biblioteca[0].abrir();
        biblioteca[2].abrir();

        biblioteca[1].folhear();

        biblioteca[0].avancarPag();
        biblioteca[2].avancarPag();
        biblioteca[2].avancarPag();


        biblioteca[2].voltarPag();
        biblioteca[2].fechar();

        biblioteca[2].avancarPag();

        renan.fazerAniversario();

    }
}
