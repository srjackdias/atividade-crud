import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaHome extends JFrame{

    public JPanel painelPrincipal;
    private JButton livroButton;
    private JButton milkShakeButton;
    private JButton juniorButton;
    private JButton plenoButton;
    private JButton seniorButton;
    private JTextArea textArea1;

    private int ultimoID = 0;

    public TelaHome() {


//        for(int i=0; i<pedidos.size();i++){
//            pedidos.get(i).getId()
//        }
//        for(Pedido p : pedidos){
//            p.getID()
//        }

//        Milkshake m = new MilkShake(1, "Gigante", "Ervilha");
//
//        pedidos.add(m);
//
//        Pedido p = pedidos.getFirst();
//        m = (Milkshake) p;


        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        livroButton.addActionListener(new ActionListener() {
            @Override
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
        });
    }
}
