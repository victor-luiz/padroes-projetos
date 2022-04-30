package strategy.avaliacao;

public class Nota {

    private int valor;
    private int peso;

    public Nota(int nota) {
        this(nota, 0);
    }

    public Nota(int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public int getNotaPonderada() {
        return this.valor * this.peso;
    }
}
