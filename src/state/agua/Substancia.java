package state.agua;

public abstract class Substancia {

    protected String nome;
    protected Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public abstract void fundir();

    public abstract void solidificar();

    public abstract void vaporizar();

    public abstract void condensar();

    public abstract void sublimir();

    public abstract void ressublimir();
}
