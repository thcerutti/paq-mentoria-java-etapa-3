package repositorios;

import java.util.ArrayList;

import modelos.Unidade;

public class UnidadesRepository {
  public ArrayList<Unidade> ListarUnidades() {
    var unidades = new ArrayList<Unidade>();
    unidades.add(new Unidade(1, "Pedra Branca"));
    unidades.add(new Unidade(2, "SC-401"));
    return unidades;
  }
}
