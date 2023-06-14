package repositorios;

import java.util.ArrayList;

import modelos.EtapaDTO;

public class EtapasDAO implements DaoInterface<EtapaDTO> {
  public ArrayList<EtapaDTO> Listar() {
    var etapas = new ArrayList<EtapaDTO>();
    etapas.add(new EtapaDTO(1, "Etapa 1"));
    etapas.add(new EtapaDTO(2, "Etapa 2"));
    etapas.add(new EtapaDTO(3, "Etapa 3"));
    etapas.add(new EtapaDTO(4, "Escola da Nuvem"));
    etapas.add(new EtapaDTO(5, "Jovem Programador SENAC"));

    return etapas;
  }
}
