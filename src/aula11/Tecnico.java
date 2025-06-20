package aula11;

public class Tecnico extends Aluno{
    private int registroTecnico;

    public void praticar() {
        System.out.println("O Aluno técnico: " + this.getNome() + " está praticando");
    }
}
