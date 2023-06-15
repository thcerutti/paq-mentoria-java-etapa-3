package repositorios;

import java.util.ArrayList;

import database.ConectorBancoDeDados;
import modelos.UnidadeDTO;

public class UnidadesDAO implements DaoInterface<UnidadeDTO> {
  public ArrayList<UnidadeDTO> Listar() {
    var conector = new ConectorBancoDeDados();
    var sql = "SELECT id, descricao FROM unidades";
    var result = conector.Listar(sql);
    var unidades = new ArrayList<UnidadeDTO>();
    for (var linha : result) {
      unidades.add(new UnidadeDTO(Integer.parseInt(linha[0]), linha[1]));
    }
    return unidades;
  }

  @Override
  public Integer Inserir(UnidadeDTO objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
  }
}
