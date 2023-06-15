package repositorios;

import java.util.ArrayList;

import modelos.UnidadeDTO;

public class UnidadesDAO implements DaoInterface<UnidadeDTO> {
  public ArrayList<UnidadeDTO> Listar() {
    var unidades = new ArrayList<UnidadeDTO>();
    unidades.add(new UnidadeDTO(1, "Pedra Branca"));
    unidades.add(new UnidadeDTO(2, "SC-401"));
    return unidades;
  }

  @Override
  public Integer Inserir(UnidadeDTO objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
  }
}
