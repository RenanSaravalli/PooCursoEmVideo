package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nik", "Amarela", 0.2f);

        c1.status();

        System.out.println("Tenho uma caneta de modelo: " + c1.getModelo() + " de ponta: " + c1.getPonta());

        System.out.println("--------------------------");

        Caneta c2 = new Caneta("REbelde", "Rosa", 0.10f);
        c2.status();
    }
}
