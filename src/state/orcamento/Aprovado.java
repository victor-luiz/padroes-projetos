package state.orcamento;

public class Aprovado implements  Estado {
    @Override
    public Estado aprovar() {
        return this;
    }

    @Override
    public Estado reprovar() {
        return null;
    }

    @Override
    public Estado finalizar() {
        return new Finalizado();
    }
}
