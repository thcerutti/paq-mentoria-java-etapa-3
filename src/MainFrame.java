import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import repositorios.EtapasDAO;
import repositorios.UnidadesDAO;

public class MainFrame extends JFrame {
  // Define os componentes do formulário
  JTextField tfNomeEducando = new JTextField("");
  JComboBox<String> cbEtapa = new JComboBox<String>();
  JComboBox<String> cbUnidade = new JComboBox<String>();

  private JPanel CriaPainelPrincipal() {
    JPanel painelPrincipal = new JPanel();
    int linhas = 20;
    int colunas = 1;
    int margemHorizontal = 5;
    int margemVertical = 5;
    painelPrincipal.setLayout(new GridLayout(linhas, colunas, margemHorizontal, margemVertical));
    return painelPrincipal;
  }

  private JPanel CriaPainelBotoes() {
    JPanel painelBotoes = new JPanel();
    painelBotoes.setLayout(new GridLayout(1, 1, 5, 5));

    JButton button = new JButton("Salvar");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Clicou no botão Salvar!");
        System.out.println("Nome do educando: " + tfNomeEducando.getText());
        System.out.println("Etapa: " + cbEtapa.getSelectedItem());
        System.out.println("Unidade: " + cbUnidade.getSelectedItem());
      }
    });
    painelBotoes.add(button);
    return painelBotoes;
  }

  private ArrayList<String> ListarUnidades() {
    var repositorio = new UnidadesDAO();
    var unidades = new ArrayList<String>();
    for (var unidade : repositorio.Listar()) {
      unidades.add(String.format("%s - %s", unidade.getId(), unidade.getNome()));
    }
    return unidades;
  }

  private ArrayList<String> ListarTodasAsEtapas() {
    var repositorio = new EtapasDAO();
    var etapas = new ArrayList<String>();
    for (var etapa : repositorio.Listar()) {
      etapas.add(String.format("%s - %s", etapa.getId(), etapa.getNome()));
    }
    return etapas;
  }

  private JPanel CriaPainelFormulario() {
    JPanel panelFormulario = new JPanel();
    panelFormulario.setLayout(new GridLayout(1, 1, 5, 5));
    panelFormulario.add(new JLabel("Nome do educando:"));
    panelFormulario.add(tfNomeEducando);

    panelFormulario.add(new JLabel("Etapa:"));
    cbEtapa.addItem("Selecione...");
    for (var etapa : ListarTodasAsEtapas()) {
      cbEtapa.addItem(etapa);
    }
    panelFormulario.add(cbEtapa);

    panelFormulario.add(new JLabel("Unidade:"));
    cbUnidade.addItem("Selecione...");
    for (var unidade : ListarUnidades()) {
      cbUnidade.addItem(unidade);
    }
    panelFormulario.add(cbUnidade);

    return panelFormulario;
  }

  public void Initialize() {
    JPanel panelPrincipal = CriaPainelPrincipal();

    this.setTitle("PAQ - Etapa 3");

    panelPrincipal.add(CriaPainelFormulario());
    panelPrincipal.add(CriaPainelBotoes());

    this.add(panelPrincipal);

    this.setSize(800, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
    mainFrame.Initialize();
  }
}
