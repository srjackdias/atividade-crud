import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaTeste extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel txtNome;
    private JLabel txtAltura;
    private JLabel txtPeso;
    private JLabel txtPerfil;
    private JButton bntCadastrar;
    private JButton bntLocalizar;
    private JButton bntEditar;
    private JButton bntApagar;
    private JButton bntMostrar;
    private JButton bntFake;
    private JTextArea  textArea;
    private JPanel painelBotoes;
    public JPanel painelPrincipal;
    private ArrayList<Object[]> pessoas = new ArrayList<>();

    public TelaTeste() {

        // ActionListener para o botão Cadastrar
        bntCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textField1.getText();
                double altura = Double.parseDouble(textField2.getText());
                double peso = Double.parseDouble(textField3.getText());
                Object[] novaPessoa = {nome, altura, peso};
                pessoas.add(novaPessoa);
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            }
        });

        // ActionListener para o botão Localizar
        bntLocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomePesquisa = textField1.getText();
                double alturaPesquisa = Double.parseDouble(textField2.getText());
                double pesoPesquisa = Double.parseDouble(textField3.getText());
                boolean encontrado = false;

                for (Object[] pessoa : pessoas) {
                    String nome = (String) pessoa[0];
                    double altura = (double) pessoa[1];
                    double peso = (double) pessoa[2];

                    if (nome.equalsIgnoreCase(nomePesquisa) && altura == alturaPesquisa && peso == pesoPesquisa) {
                        textField1.setText(nome);
                        textField2.setText(String.valueOf(altura));
                        textField3.setText(String.valueOf(peso));
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Registro encontrado");
                        return;
                    }
                }

                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Registro não encontrado");
                }
            }
        });

        // ActionListener para o botão Editar
        bntEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeEdicao = JOptionPane.showInputDialog("Qual registro deseja editar?");
                String novoNome = JOptionPane.showInputDialog("Qual é o novo nome?");
                String novaAltura = JOptionPane.showInputDialog("Qual é a nova altura?");
                String novoPeso = JOptionPane.showInputDialog("Qual é o novo peso?");

                if (nomeEdicao != null && novoNome != null && novaAltura != null && novoPeso != null) {
                    for (Object[] pessoa : pessoas) {
                        String nome = (String) pessoa[0];

                        if (nome.equals(nomeEdicao)) {
                            double alturaOriginal = (Double) pessoa[1];
                            double pesoOriginal = (Double) pessoa[2];
                            double novaAlturaDouble = Double.parseDouble(novaAltura);
                            double novoPesoDouble = Double.parseDouble(novoPeso);

                            if (alturaOriginal != novaAlturaDouble || pesoOriginal != novoPesoDouble) {
                                pessoa[0] = novoNome;
                                pessoa[1] = novaAlturaDouble;
                                pessoa[2] = novoPesoDouble;

                                JOptionPane.showMessageDialog(null, "Edição realizada com sucesso");
                                return;
                            } else {
                                JOptionPane.showMessageDialog(null, "Os valores informados são iguais aos originais. Nenhuma alteração realizada.");
                                return;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Registro não encontrado");
                }
            }
        });

        // ActionListener para o botão Apagar
        bntApagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeApagar = JOptionPane.showInputDialog("Qual registro deseja apagar?");

                if (nomeApagar != null) {
                    for (int i = 0; i < pessoas.size(); i++) {
                        String nome = (String) pessoas.get(i)[0];

                        if (nome.equals(nomeApagar)) {
                            pessoas.remove(i);
                            JOptionPane.showMessageDialog(null, "Registro apagado com sucesso");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Registro não encontrado");
                }
            }
        });

        // ActionListener para o botão Mostrar
        bntMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                for (Object[] pessoa : pessoas) {
                    String nome = (String) pessoa[0];
                    double altura = (double) pessoa[1];
                    double peso = (double) pessoa[2];
                    textArea.append("Nome: " + nome + ", Altura: " + altura + ", Peso: " + peso + "\n");
                }
            }
        });


        bntFake.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] nomes = {"João", "Maria", "José", "Ana", "Carlos", "Fernanda", "Paulo", "Clara", "Lucas", "Beatriz"};
                double[] alturas = {1.50, 1.60, 1.70, 1.80, 1.90, 2.00, 1.55, 1.65, 1.75, 1.85};
                double[] pesos = {50.0, 60.0, 70.0, 80.0, 90.0, 100.0, 55.0, 65.0, 75.0, 85.0};

                int numeroDeRegistros = (int) (Math.random() * 10) + 1;

                for (int i = 0; i < numeroDeRegistros; i++) {
                    String nome = nomes[(int) (Math.random() * nomes.length)];
                    double altura = alturas[(int) (Math.random() * alturas.length)];
                    double peso = pesos[(int) (Math.random() * pesos.length)];
                    Object[] novaPessoa = {nome, altura, peso};
                    pessoas.add(novaPessoa);
                }
                JOptionPane.showMessageDialog(null, "Registros fake gerados com sucesso");
            }
        });

    }


}