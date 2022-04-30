package state.agua;

public class Solido implements Estado {

    @Override
    public void fuzao(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void solidificacao(Substancia substancia) {
        throw new RuntimeException("Não é possível solidificar, estado da água é Solido");
    }

    @Override
    public void vaporizacao(Substancia substancia) {
        throw new RuntimeException("Não é possível evaporar, estado da água é Solido");
    }

    @Override
    public void condensacao(Substancia substancia) {
        throw new RuntimeException("Não é possível condensar, estado da água é Solido");
    }

    @Override
    public void sublimacao(Substancia substancia) {
        substancia.setEstado(new Gasoso());
    }

    @Override
    public void ressublimacao(Substancia substancia) {
        throw new RuntimeException("Não é possível ressublimir, estado da água é Solido");
    }
}
