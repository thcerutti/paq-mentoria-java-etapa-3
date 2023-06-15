package modelos;

public class EducandoDTO {
  private int id;
  private String nomeCompleto;
  private EtapaDTO etapa;
  private UnidadeDTO unidade;

  public EducandoDTO(String nome, EtapaDTO etapa, UnidadeDTO unidade) {
    this.nomeCompleto = nome;
    this.etapa = etapa;
    this.unidade = unidade;
  }

  public EducandoDTO(Integer id, String nome, EtapaDTO etapa, UnidadeDTO unidade) {
    this.id = id;
    this.nomeCompleto = nome;
    this.etapa = etapa;
    this.unidade = unidade;
  }

  public int getId() {
    return this.id;
  }

  public String getNomeCompleto() {
    return this.nomeCompleto;
  }

  public EtapaDTO getEtapa() {
    return this.etapa;
  }

  public UnidadeDTO getUnidade() {
    return this.unidade;
  }
}
