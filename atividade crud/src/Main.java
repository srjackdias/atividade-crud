import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    TelaPrincipal t = new TelaPrincipal();
    t.setContentPane(t.PainelPincipal);
    t.setTitle("Primeiro swing");
    t.setSize(400,300);
    t.setVisible(true);
    t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}