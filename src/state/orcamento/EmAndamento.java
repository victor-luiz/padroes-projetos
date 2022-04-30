package state.orcamento;

public class EmAndamento implements Estado {
    @Override
    public Estado aprovar() {
        return new Reprovado();
    }

    @Override
    public Estado reprovar() {
        return new Reprovado();
    }

    @Override
    public Estado finalizar() {
        return null;
    }
}
