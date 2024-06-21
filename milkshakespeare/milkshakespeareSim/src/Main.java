import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando pedidos
        Pedido pedido1 = new MilkShake(1, "Grande", "Morango");
        Pedido pedido2 = new Livro(2, "Hamlet");
        Pedido pedido3 = new MilkShake(3, "Médio", "Chocolate");

        // Criando colaboradores
        Junior junior1 = new Junior("João");
        Pleno pleno1 = new Pleno("Maria");
        Senior senior1 = new Senior("Pedro");

        // Simulando a fila de pedidos
        List<Pedido> fila = new ArrayList<>();
        fila.add(pedido1);
        fila.add(pedido2);
        fila.add(pedido3);

        // Simulando o atendimento dos pedidos
        junior1.atenderPedidoMilkshake(fila);
        pleno1.atenderPedidoLivro(fila);
        senior1.atenderPedido(fila);
    }
}

