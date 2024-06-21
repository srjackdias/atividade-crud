import java.util.List;

public class Junior {
    private String nome;

    public Junior(String nome) {
        this.nome = nome;
    }

    public void atenderPedidoMilkshake(List<Pedido> fila) {
        for (Pedido pedido : fila) {
            if (pedido instanceof MilkShake) {
                MilkShake milkshake = (MilkShake) pedido;
                System.out.println("Junior " + nome + " atendeu o pedido de milkshake " + milkshake.getId());
                fila.remove(pedido);
                return;
            }
        }
    }
}
