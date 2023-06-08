import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
  public void initialize() {
    JPanel panelPrincipal = new JPanel();
    int linhas = 20;
    int colunas = 1;
    int margemHorizontal = 5;
    int margemVertical = 5;
    panelPrincipal.setLayout(new GridLayout(linhas, colunas, margemHorizontal, margemVertical));

    this.setTitle("PAQ - Etapa 3");

    // Formulário
    JLabel lbBNomeEducando = new JLabel("Nome do educando:");
    panelPrincipal.add(lbBNomeEducando);

    JTextField tfNomeEducando = new JTextField("");
    panelPrincipal.add(tfNomeEducando);

    JLabel lbEtapa = new JLabel("Etapa:");
    panelPrincipal.add(lbEtapa);

    JTextField tfEtapa = new JTextField("");
    panelPrincipal.add(tfEtapa);

    JLabel lbUnidade = new JLabel("Unidade:");
    panelPrincipal.add(lbUnidade);

    JTextField tfUnidade = new JTextField("");
    panelPrincipal.add(tfUnidade);

    // Botões
    JPanel panelBotoes = new JPanel();
    panelBotoes.setLayout(new GridLayout(1, 1, 5, 5));

    JButton button = new JButton("Salvar");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Clicou no botão Salvar" + "!");
      }
    });
    panelBotoes.add(button);

    panelPrincipal.add(panelBotoes);

    this.add(panelPrincipal);

    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
    mainFrame.initialize();
  }
}
