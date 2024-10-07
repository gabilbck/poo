package exe1;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva");
        Produto produto1 = new Produto(10.50, 100);
        Produto produto2 = new Produto(20.00, 50);

        ItemPedido item1 = new ItemPedido(2, produto1);
        ItemPedido item2 = new ItemPedido(1, produto2);

        Pedido pedido = new Pedido(1, cliente, FormaPagto.CARTAO);
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Total do pedido: " + pedido.calcularTotalPedido());
    }
}