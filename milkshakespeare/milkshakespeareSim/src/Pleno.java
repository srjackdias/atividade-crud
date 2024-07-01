import java.util.List;

public class Pleno {
    private String nome;

    public Pleno(String nome) {
        this.nome = nome;
    }

    public void atenderPedidoLivro(List<Pedido> fila) {
      
     System.out.println("Pleno " + nome + " atendeu o pedido de livro " );
              
           
    }
}
