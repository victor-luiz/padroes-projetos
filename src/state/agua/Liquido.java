package state.agua;

public class Liquido implements Estado {

    @Override
    public void fuzao(Substancia substancia) {
        throw new RuntimeException("Não é possível fundir, estado da água é Líquido");
    }

    @Override
    public void solidificacao(Substancia substancia) {
        substancia.setEstado(new Solido());
    }

    @Override
    public void vaporizacao(Substancia substancia) {
        substancia.setEstado(new Gasoso());
    }

    @Override
    public void condensacao(Substancia substancia) {
        throw new RuntimeException("Não é possível condesar, estado da água é Líquido");
    }

    @Override
    public void sublimacao(Substancia substancia) {
        throw new RuntimeException("Não é possível sublimir, estado da água é Líquido");
    }

    @Override
    public void ressublimacao(Substancia substancia) {
        throw new RuntimeException("Não é possível condesar, estado da água é Líquido");
    }
}
