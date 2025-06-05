package aula03.atividade;

public class Serie {
    String nome;
    String empresa;
    String dataLancamento;
    int duracao;
    boolean assistida = false;
    int avaliacao;
    String[] elenco;

    void assistirSerie() {
        assistida = true;
        System.out.println("Parabéns você assistiu a série: " + this.nome);
    }

    void avaliarSerie(int nota) {
        if (nota > 10) {
            this.avaliacao = 10;
        } else if (nota < 0) {
            this.avaliacao = 0;
        } else {
            this.avaliacao = nota;
        }
    }

    void adicionarAtores(String[] listaAtores) {
        this.elenco = listaAtores;
    }

    void statusSerie() {
        System.out.println("-------");
        System.out.println("Nome:            " + this.nome);
        System.out.println("Empresa:         " + this.empresa);
        System.out.println("Data Lançamento: " + this.dataLancamento);
        System.out.println("Duração:         " + this.duracao + " Minutos");
        System.out.println("Assistida:       " + this.assistida);
        System.out.println("Avaliação nota:  " + this.avaliacao);
        System.out.print("Elenco:          ");
        for (int i = 0; i < this.elenco.length; i++) {
            System.out.print(this.elenco[i] + " ");
        }

    }
}
