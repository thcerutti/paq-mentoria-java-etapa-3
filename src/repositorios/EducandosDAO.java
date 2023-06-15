package repositorios;

import java.util.ArrayList;

import modelos.EducandoDTO;
import modelos.EtapaDTO;
import modelos.UnidadeDTO;
import database.ConectorBancoDeDados;

public class EducandosDAO implements DaoInterface<EducandoDTO> {

  public ArrayList<EducandoDTO> Listar() {
    var educandos = new ArrayList<EducandoDTO>();
    var conn = new ConectorBancoDeDados();

    var sql = "SELECT ed.id, ed.nome_completo, et.id as etapaId, et.descricao as etapa FROM educandos ed, etapas et where ed.etapa_id = et.id";
    var result = conn.Listar(sql);
    if (result.size() > 0) {
      for (var linhaEducando : result) {
        var id = Integer.parseInt(linhaEducando[0]);
        var nome = linhaEducando[1];
        var etapa = new EtapaDTO(Integer.parseInt(linhaEducando[2]), linhaEducando[3]);
        var unidade = (UnidadeDTO) null;
        var educando = new EducandoDTO(id, nome, etapa, unidade);
        educandos.add(educando);
      }
    }
    return educandos;
  }

  public Integer Inserir(EducandoDTO objeto) {
    try {
      var sql = "INSERT INTO educandos (nome_completo, etapa_id) VALUES ('" + objeto.getNomeCompleto() + "', "
          + objeto.getEtapa().getId() + ")";
      var conn = new ConectorBancoDeDados();
      var result = conn.Executar(sql);
      return result;
    } catch (Exception e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }
}
