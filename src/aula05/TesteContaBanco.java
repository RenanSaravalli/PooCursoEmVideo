package aula05;

public class TesteContaBanco {
    public static void main(String[] args) {
        ContaBanco contaCleber = new ContaBanco();
        contaCleber.abrirConta("Cleber", "cp");
        contaCleber.pagarMensal();
        contaCleber.depositar(1213.13);
        contaCleber.statusConta();

        ContaBanco valentina = new ContaBanco();
        valentina.abrirConta("Valentina", "cc");
        valentina.sacar(50);
        valentina.fecharConta();
        valentina.statusConta();
        valentina.depositar(10);
    }
}
