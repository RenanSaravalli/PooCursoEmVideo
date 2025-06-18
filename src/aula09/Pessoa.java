package aula09;

import java.util.Timer;
import java.util.TimerTask;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void fazerAniversario() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Timer para " + this.nome + " fazer aniversário e completar: " + (this.idade + 1) + " anos");
        System.out.println("Entrando na contagem regressiva: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1);
        }
        System.out.println("00:00 Meus parabéns " + this.nome);
        setIdade(getIdade() + 1);
    }
}
