package aula03.atividade;

public class Mouse {
    String modelo;
    String marca;
    String dataFabricacao;
    boolean temRGB;
    boolean ehGamer;
    String tipoConexao;
    int dpi;

    void status() {
        System.out.println("Modelo:             " + this.modelo);
        System.out.println("Marca:              " + this.marca);
        System.out.println("Data de fabricação: " + this.dataFabricacao);
        System.out.println("Com RGB:            " + this.temRGB);
        System.out.println("Mouse gamer:        " + this.ehGamer);
        System.out.println("Tipo de conexão:    " + this.tipoConexao);
        System.out.println("Seu DPI:            " + this.dpi);
    }

    void mouseGamer() {
        if (this.temRGB) {
            this.ehGamer = true;
            System.out.println("Legal você tem um mouse gamer!");
        } else {
            System.out.println("Seu mouse não tem RGB, então ele não é gamer!!!!");
        }
    }

    void jogarJoguinho() {
        if (this.ehGamer) {
            System.out.println("Bora competir seu zé ruela");
        } else {
            System.out.println("Otário seu mouse não é gamer, nem vem!!!!!");
        }
    }
}
