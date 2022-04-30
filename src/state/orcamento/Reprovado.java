package state.orcamento;

public class Reprovado implements Estado {
    @Override
    public Estado aprovar() {
        return null;
    }

    @Override
    public Estado reprovar() {
        return this;
    }

    @Override
    public Estado finalizar() {
        return new Finalizado();
    }
}
