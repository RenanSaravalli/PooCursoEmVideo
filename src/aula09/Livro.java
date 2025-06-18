package aula09;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro() {
    }

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println("Exibindo detalhes do livro: " + this.getTitulo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de Páginas: " + getTotPaginas());
        System.out.println("Página atual da leitura: " + getPagAtual());
        System.out.println("Livro está aberto: " + ((isAberto()) ? "Sim" : "Não"));
        System.out.println("Leitor do livro:  " + getLeitor().getNome());
    }

    @Override
    public void abrir() {
        if (isAberto()) {
            System.out.println("O livro já está aberto!");
        } else {
            setAberto(true);
        }
    }

    @Override
    public void fechar() {
        if (isAberto()) {
            setAberto(false);
        } else {
            System.out.println("O livro: " + getTitulo() + " já está fechado!");
        }
    }

    @Override
    public void folhear() {
        System.out.println("Folheando livro: " + this.getTitulo());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Estamos na página: " + this.getPagAtual());
    }

    @Override
    public void avancarPag() {
        if (this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avançando página...");
            System.out.println("Agora você está na página: " + this.getPagAtual() + ". do livro: " + this.getTitulo());
        } else {
            System.out.println("Você já chegou na última página: " + this.getPagAtual() + " do livro: " + this.getTitulo());
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 0) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Voltando página...");
            System.out.println("Agora você está na página: " + this.getPagAtual() + ". do livro: " + this.getTitulo());
        } else {
            System.out.println("Você já chegou na primeira página: " + this.getPagAtual() + " do livro: " + this.getTitulo());
        }
    }
}
