package state.agua;

public class Agua extends Substancia {

    public Agua(Estado estado) {
        this.estado = estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void fundir() {
        this.estado.fuzao(this);
    }

    public void solidificar() {
        this.estado.solidificacao(this);
    }

    public void vaporizar() {
        this.estado.vaporizacao(this);
    }

    public void condensar() {
        this.estado.condensacao(this);
    }

    public void sublimir() {
        this.estado.sublimacao(this);
    }

    public void ressublimir() {
        this.estado.ressublimacao(this);
    }
}
