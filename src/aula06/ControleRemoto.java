package aula06;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        for (int i = 0; i < this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("TV desligada!");
        }
    }

    @Override
    public void menosVolume() {
        if (isLigado()) {
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado()) {
            this.setVolume(0);
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado()) {
            this.setVolume(50);
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void play() {
        if (isLigado()) {
            this.setTocando(true);
        } else {
            System.out.println("TV desligada");
        }
    }

    @Override
    public void pause() {
        if (isLigado()) {
            this.setTocando(false);
        } else {
            System.out.println("TV desligada");
        }
    }
}
