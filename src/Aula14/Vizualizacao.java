package Aula14;

public class Vizualizacao {
    private Gafanhato espectador;
    private Video filme;

    public Vizualizacao() {
    }

    public Vizualizacao(Gafanhato espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public Gafanhato getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhato espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar(){
        this.filme.setAvaliacao(1);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int totalAvaliacao;
        if (porc <= 20) {
            totalAvaliacao = 3;
        } else if (porc <= 50) {
            totalAvaliacao = 5;
        } else if (porc <= 90) {
            totalAvaliacao = 8;
        } else {
            totalAvaliacao = 10;
        }
        this.filme.setAvaliacao(totalAvaliacao);
    }

    @Override
    public String toString() {
        return "Vizualizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }
}
