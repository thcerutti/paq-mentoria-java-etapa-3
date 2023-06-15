import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import modelos.EducandoDTO;
import modelos.EtapaDTO;
import repositorios.EtapasDAO;
import repositorios.UnidadesDAO;
import repositorios.EducandosDAO;

public class MainFrame extends JFrame {
  // Define os componentes do formulário
  JTextField tfNomeEducando = new JTextField("");
  JComboBox<String> cbEtapa = new JComboBox<String>();
  JComboBox<String> cbUnidade = new JComboBox<String>();

  private JPanel CriaPainelPrincipal() {
    var painelPrincipal = new JPanel();
    int linhas = 2;
    int colunas = 1;
    int margemHorizontal = 5;
    int margemVertical = 5;
    painelPrincipal.setLayout(new GridLayout(linhas, colunas, margemHorizontal, margemVertical));
    return painelPrincipal;
  }

  private int buscarIdDoComboBox(String textoSelecionado) {
    return Integer.parseInt(textoSelecionado.split(" - ")[0]);
  }

  private JPanel CriaPainelBotoes() {
    JPanel painelBotoes = new JPanel();
    painelBotoes.setLayout(new GridLayout(1, 1, 5, 5));

    JButton btnSalvarEducando = new JButton("Salvar");
    btnSalvarEducando.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        var etapaId = buscarIdDoComboBox(cbEtapa.getSelectedItem().toString());
        var etapa = new EtapaDTO(etapaId, "");
        var educando = new EducandoDTO(tfNomeEducando.getText(), etapa, null);
        var repositorio = new EducandosDAO();
        var registrosInseridos = repositorio.Inserir(educando);
        if (registrosInseridos > 0) {
          JOptionPane.showMessageDialog(null, "Educando inserido com sucesso!");
        } else {
          JOptionPane.showMessageDialog(null, "Erro ao inserir educando!");
        }
      }
    });
    painelBotoes.add(btnSalvarEducando);
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
    panelFormulario.setLayout(new GridLayout(3, 1, 5, 5));
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
