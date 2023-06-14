package modelos;

public class Unidade {
  private int id;
  private String nome;

  public Unidade(int id, String nome) {
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
