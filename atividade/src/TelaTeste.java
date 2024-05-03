import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTeste  extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel txtNome;
    private JLabel txtAltura;
    private JLabel txtPeso;
    private JLabel txtPerfil;
    private JButton bntCadastrar;
    private JButton bntLocalizar;
    private JButton bntBotao;
    private JButton bntApagar;
    private JButton bntMostrar;
    private JButton bntFake;
    public JPanel painelPrincipal;

    public TelaTeste() {
        bntCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
