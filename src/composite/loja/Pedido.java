package composite.loja;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItens(ItemPedido itemPedido) {
        this.itens.add(itemPedido);
    }

    public double preço() {
        return this.itens.stream().mapToDouble(ItemPedido::preco).sum();
    }

}
