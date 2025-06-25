package Aula14;

public class Gafanhato extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhato() {
    }

    public Gafanhato(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm() {
        System.out.println("Assistindo mais um vídeo");
    }

    @Override
    protected void ganharExperiencia() {
        setExperiencia(getExperiencia()+1);
    }

    @Override
    public String toString() {
        return "Gafanhato{" +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                ", experiencia=" + experiencia +
                " login='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
