package composite.tomada;

import java.util.ArrayList;
import java.util.List;

public class Regua implements Tomada {

    private List<Tomada> tomadas;
    private int quantidadeEntradas;
    private int entradasDiponiveis;

    public Regua(int quantidadeEntradas) {
        this.quantidadeEntradas = quantidadeEntradas;
        this.entradasDiponiveis = quantidadeEntradas;
        this.tomadas = new ArrayList<>();
    }

    @Override
    public void adicionarTomada(Tomada tomada) {
        if (this.entradasDiponiveis > 0) {
            this.tomadas.add(tomada);
            this.entradasDiponiveis--;
        }
    }

    @Override
    public int quantidadeEntradas() {
        return this.quantidadeEntradas;
    }

    @Override
    public int entradasDiponiveis() {
        int entradasDiponiveisTotal = this.entradasDiponiveis;
        if (!this.tomadas.isEmpty()) {
            for (Tomada tomada : tomadas) {
                entradasDiponiveisTotal = entradasDiponiveis + tomada.entradasDiponiveis();
            }
        }
        return entradasDiponiveisTotal;
    }
}
