package state.orcamento;

public interface Estado {

    Estado aprovar();
    Estado reprovar();
    Estado finalizar();
}
