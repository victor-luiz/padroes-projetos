package null_object.nota;

public class NotaSimples implements Nota {
    private double valor;

    public NotaSimples(double valor) {
        this.valor = valor;
    }

    @Override
    public double getNota() {
        return valor;
    }
}
