package aula11;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(52);
        v1.setSexo('M');
        System.out.println(v1);

        System.out.println("---------------------------------------------");

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(11111);
        a1.setCurso("Informática");
        a1.setIdade(19);
        a1.setSexo('M');
        System.out.println(a1);
        a1.pagarMensalidade();

        System.out.println("---------------------------------------------");

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1231);
        b1.setNome("Jubileu");
        b1.setBolsa(12.1f);
        b1.setSexo('M');
        b1.setIdade(10);
        b1.pagarMensalidade();
        System.out.println(b1);

        System.out.println("---------------------------------------------");

        Professor p1 = new Professor();
        p1.setNome("Juliana");
        p1.setIdade(34);
        p1.setSexo('F');
        p1.setEspecialidade("Educação Física");
        p1.setSalario(1500);
        p1.receberAumento(100);
        System.out.println(p1);
        System.out.println("---------------------------------------------");
    }
}
