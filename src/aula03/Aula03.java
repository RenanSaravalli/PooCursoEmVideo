package aula03;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; privada
        c1.carga = 80;
        /*Vai deixar tranquilamente, da uma olhada o métod main está
        * dentro de uma classe que está utilizando a classe caneta se
        * eu criar um metodo em outro pacote e tentar acessar essa
        * caneta.carga eu não vou conseguir*/
        //c1.tampada = true; privada
        c1.destampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
