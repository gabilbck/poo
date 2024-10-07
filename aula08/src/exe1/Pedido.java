package exe1;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numPedido;
    private List<ItemPedido> itens;
    private Cliente cliente;
    private FormaPagto formaPagto;

    public Pedido(int numPedido, Cliente cliente, FormaPagto formaPagto) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.formaPagto = formaPagto;
        this.itens = new ArrayList<>();
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaPagto getFormaPagto() {
        return formaPagto;
    }

    public void setFormaPagto(FormaPagto formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularTotalItem();
        }
        return total;
    }
}