package composite.tomada;

import java.util.Objects;

public class TomadaSimples implements Tomada {

    private Tomada tomada;

    @Override
    public void adicionarTomada(Tomada tomada) {
        this.tomada = tomada;
    }

    @Override
    public int quantidadeEntradas() {
        return 1;
    }

    @Override
    public int entradasDiponiveis() {
        return Objects.isNull(tomada) ? this.quantidadeEntradas() : tomada.entradasDiponiveis();
    }
}
