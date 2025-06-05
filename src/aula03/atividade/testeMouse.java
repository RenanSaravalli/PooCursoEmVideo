package aula03.atividade;

public class testeMouse {
    public static void main(String[] args) {
        Mouse cobra = new Mouse();
        cobra.modelo = "Cobra";
        cobra.marca = "Redragon";
        cobra.dataFabricacao = "12-03-2017";
        cobra.tipoConexao = "Fio";
        cobra.dpi = 800;

        cobra.adicionarRGB();
        cobra.mouseGamer();

        cobra.jogarJoguinho();

        cobra.status();
    }
}
