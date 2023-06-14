package repositorios;

import java.util.ArrayList;

import modelos.EducandoDTO;

public class EducandosDAO implements DaoInterface<EducandoDTO> {

  public ArrayList<EducandoDTO> Listar() {
    var educandos = new ArrayList<EducandoDTO>();
    var etapas = new EtapasDAO().Listar();
    var unidades = new UnidadesDAO().Listar();
    var pedraBranca = unidades.get(0);
    var sc401 = unidades.get(1);

    educandos.add(new EducandoDTO(1, "João", etapas.get(0), pedraBranca));
    educandos.add(new EducandoDTO(2, "Maria", etapas.get(1), pedraBranca));
    educandos.add(new EducandoDTO(3, "José", etapas.get(2), sc401));
    educandos.add(new EducandoDTO(4, "Pedro", etapas.get(2), sc401));
    return educandos;
  }
}
