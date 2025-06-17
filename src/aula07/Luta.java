package aula07;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Metodos públicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (aprovada) {
            System.out.println("=== DESAFIADO ===");
            this.desafiado.apresentar();
            System.out.println("=== DESAFIANTE ===");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0: // Empatar
                    System.out.println("=== Luta Empatada ===");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // desafiado vence
                    System.out.println("=== Desafiado: " + this.desafiado.getNome() + " ganhou a luta ===");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante vence
                    System.out.println("=== Desafiante: " + this.desafiante.getNome() + " ganhou a luta ===");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                default:
                    System.out.println("Valor incorreto!");
                    break;
            }

        } else {
            System.out.println("A luta não pode acontecer!!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
