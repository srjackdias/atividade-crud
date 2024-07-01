public class Livro extends Pedido {

    private String nome;

    public Livro(int id, String nome) {
        super(id);
        this.nome = nome;
    }

    public void atenderPedidoLivro() {
        System.out.println("1: " + getId() + " Atendendo pedido de livro: " + nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
