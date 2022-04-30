package state.agua;

public interface Estado {

    void fuzao(Substancia substancia);
    void solidificacao(Substancia substancia);
    void vaporizacao(Substancia substancia);
    void condensacao(Substancia substancia);
    void sublimacao(Substancia substancia);
    void ressublimacao(Substancia substancia);
}
