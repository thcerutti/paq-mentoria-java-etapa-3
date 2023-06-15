package repositorios;

import java.util.ArrayList;

import database.ConectorBancoDeDados;
import modelos.EtapaDTO;

public class EtapasDAO implements DaoInterface<EtapaDTO> {
  public ArrayList<EtapaDTO> Listar() {
    var etapas = new ArrayList<EtapaDTO>();
    var conector = new ConectorBancoDeDados();
    var sql = "SELECT id, descricao FROM etapas";
    var result = conector.Listar(sql);
    for (var linha : result) {
      etapas.add(new EtapaDTO(Integer.parseInt(linha[0]), linha[1]));
    }
    return etapas;
  }

  @Override
  public Integer Inserir(EtapaDTO objeto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Inserir'");
  }
}
