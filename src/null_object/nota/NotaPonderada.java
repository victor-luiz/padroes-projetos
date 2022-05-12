package null_object.nota;

public class NotaPonderada implements Nota{
    private double valor;
    private double peso;

    public NotaPonderada(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    @Override
    public double getNota() {
        return valor * peso;
    }
}
