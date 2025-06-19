package aula10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Cleytin");
        p2.setNome("Fernando");
        p3.setNome("Claudio");
        p4.setNome("Fabia");

        p1.setSexo("M");
        p4.setSexo("F");

        p2.setIdade(19);

        p2.setCurso("Informatica");

        p3.setSalario(2123f);

        p4.setSetor("Estoque");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
