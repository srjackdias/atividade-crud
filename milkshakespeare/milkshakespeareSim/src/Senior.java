import java.util.List;

public class Senior {
    private String nome;

    public Senior(String nome) {
        this.nome = nome;
    }

    public void atenderPedido(List<Pedido> fila) {
        for (Pedido pedido : fila) {
            if (pedido instanceof MilkShake) {
                MilkShake milkshake = (MilkShake) pedido;
                System.out.println("Senior " + nome + " atendeu o pedido de milkshake " + milkshake.getId());
                fila.remove(pedido);
                return;
            } else if (pedido instanceof Livro) {
                Livro livro = (Livro) pedido;
                System.out.println("Senior " + nome + " atendeu o pedido de livro " + livro.getId());
                fila.remove(pedido);
                return;
            }
        }
    }
}
