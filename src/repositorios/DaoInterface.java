package repositorios;

import java.util.ArrayList;

public interface DaoInterface<T> {
  ArrayList<T> Listar();
  Integer Inserir(T objeto);
}
