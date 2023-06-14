package repositorios;

import java.util.ArrayList;

import modelos.Etapa;

public class EtapasRepository {
  public ArrayList<Etapa> ListarEtapas() {
    var etapas = new ArrayList<Etapa>();
    etapas.add(new Etapa(1, "Etapa 1"));
    etapas.add(new Etapa(2, "Etapa 2"));
    etapas.add(new Etapa(3, "Etapa 3"));
    etapas.add(new Etapa(4, "Escola da Nuvem"));
    etapas.add(new Etapa(5, "Jovem Programador SENAC"));

    return etapas;
  }
}
