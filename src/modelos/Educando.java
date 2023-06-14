package modelos;

public class Educando {
  private int id;
  private String nomeCompleto;
  private Etapa etapa;
  private Unidade unidade;

  public Educando(int id, String nome, Etapa etapa, Unidade unidade) {
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

  public Etapa getEtapa() {
    return this.etapa;
  }

  public Unidade getUnidade() {
    return this.unidade;
  }
}
