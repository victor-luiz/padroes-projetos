package state.orcamento;

public class Finalizado implements Estado {
    @Override
    public Estado aprovar() {
        return null;
    }

    @Override
    public Estado reprovar() {
        return null;
    }

    @Override
    public Estado finalizar() {
        return null;
    }
}
