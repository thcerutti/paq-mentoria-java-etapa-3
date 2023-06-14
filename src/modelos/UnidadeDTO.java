package modelos;

public class UnidadeDTO {
  private int id;
  private String nome;

  public UnidadeDTO(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public int getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }
}
