public class MilkShake extends Pedido {


    String tamanho;

    String sabor;

    public MilkShake(int id, String tamanho, String sabor) {
        super(id);
        this.tamanho = tamanho;
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
