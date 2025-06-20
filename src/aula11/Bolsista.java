package aula11;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renoverBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
