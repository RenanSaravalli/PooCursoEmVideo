package aula03.atividade;

public class TesteSerie {
    public static void main(String[] args) {
        Serie naruto = new Serie();
        naruto.nome = "Naruto";
        naruto.empresa = "Masashi Kishimoto";
        naruto.dataLancamento = "03-10-2002";
        naruto.duracao = 1108;


        naruto.adicionarAtores(new String[]{"Naruto", "Sasuke", "Sakura", "Kakashi", "Gai", "Rocke lee", "Neji", "Obito"});
        naruto.assistirSerie();
        naruto.avaliarSerie(79);
        naruto.statusSerie();
    }
}
