package Aula14;

public class Gafanhato extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm() {
        System.out.println("Assistindo mais um vídeo");
    }

    @Override
    protected void ganharExperiencia() {

    }
}
