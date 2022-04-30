package composite.loja;

public class ItemPedido {

    private Item item;
    private int quantidade;

    public ItemPedido(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public double preco() {
        return this.item.preco() * this.quantidade;
    }
}
