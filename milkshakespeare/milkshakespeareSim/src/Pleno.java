import java.util.List;

public class Pleno {
    private String nome;

    public Pleno(String nome) {
        this.nome = nome;
    }

    public void atenderPedidoLivro(List<Pedido> fila) {
        for (Pedido pedido : fila) {
            if (pedido instanceof Livro) {
                Livro livro = (Livro) pedido;
                System.out.println("Pleno " + nome + " atendeu o pedido de livro " + livro.getId());
                fila.remove(pedido);
                return;
            }
        }
    }
}
