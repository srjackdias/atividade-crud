import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaHome t = new TelaHome();
  
        if (t.painelPrincipal != null) {
            t.setContentPane(t.painelPrincipal);
            t.setTitle("Simulator");
            t.setSize(400, 300);
            t.setVisible(true);
            t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            System.out.println("Error: painelPrincipal is not initialized.");
        }
    }
}
