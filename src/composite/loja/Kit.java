package composite.loja;

public class Kit implements Item {

    private Item item;
    private int quantidade;

    public Kit(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    @Override
    public double preco() {
        return this.item.preco() * quantidade;
    }
}
