package state.agua;

public class Gasoso implements Estado {

    @Override
    public void fuzao(Substancia substancia) {
        throw new RuntimeException("Não é possível fundir, estado da água é Gasoso");
    }

    @Override
    public void solidificacao(Substancia substancia) {
        throw new RuntimeException("Não é possível solidificar, estado da água é Gasoso");
    }

    @Override
    public void vaporizacao(Substancia substancia) {
        throw new RuntimeException("Não é possível evaporar, estado da água é Gasoso");
    }

    @Override
    public void condensacao(Substancia substancia) {
        substancia.setEstado(new Liquido());
    }

    @Override
    public void sublimacao(Substancia substancia) {
        throw new RuntimeException("Não é possível sublimir, estado da água é Gasoso");
    }

    @Override
    public void ressublimacao(Substancia substancia) {
        substancia.setEstado(new Solido());
    }
}
