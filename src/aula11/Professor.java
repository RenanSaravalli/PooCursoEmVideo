package aula11;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento(double valorAumento) {
        this.salario += valorAumento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
