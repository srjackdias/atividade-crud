import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal  extends  JFrame{


    public JPanel PainelPincipal;
    private JTextField textNome;
    private JButton bntEnviar;

    public TelaPrincipal() {
        bntEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "olá " + textNome.getText());
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
