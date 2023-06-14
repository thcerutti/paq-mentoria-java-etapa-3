package repositorios;

import java.util.ArrayList;

import modelos.Educando;

public class EducandosRepository {

  public ArrayList<Educando> ListarEducandos() {
    var educandos = new ArrayList<Educando>();
    var etapas = new EtapasRepository().ListarEtapas();
    var unidades = new UnidadesRepository().ListarUnidades();
    var pedraBranca = unidades.get(0);
    var sc401 = unidades.get(1);

    educandos.add(new Educando(1, "João", etapas.get(0), pedraBranca));
    educandos.add(new Educando(2, "Maria", etapas.get(1), pedraBranca));
    educandos.add(new Educando(3, "José", etapas.get(2), sc401));
    educandos.add(new Educando(4, "Pedro", etapas.get(2), sc401));
    return educandos;
  }
}
