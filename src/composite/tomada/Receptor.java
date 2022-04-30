package composite.tomada;

public class Receptor {

    Tomada tomada;

    public void setTomada(Tomada tomada) {
        this.tomada = tomada;
    }

    public int quantidadeEntradas() {
        return  tomada.entradasDiponiveis();
    }
}
