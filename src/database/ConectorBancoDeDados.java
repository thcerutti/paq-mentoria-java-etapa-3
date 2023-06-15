package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

public class ConectorBancoDeDados {
  private String url = "";
  private String username = "";
  private String password = "";

  public ArrayList<String[]> Listar(String sql) {

    try {
      Connection conexao = DriverManager.getConnection(url, username, password);
      Statement consulta = conexao.createStatement();
      ResultSet resultado = consulta
          .executeQuery(sql);
      var retornoDaConsulta = new ArrayList<String[]>();
      while (resultado.next()) {
        var linha = new String[resultado.getMetaData().getColumnCount()];
        for (int i = 0; i < resultado.getMetaData().getColumnCount(); i++) {
          linha[i] = resultado.getString(i + 1);
        }
        retornoDaConsulta.add(linha);
      }

      resultado.close();
      consulta.close();
      conexao.close();

      return retornoDaConsulta;
    } catch (SQLException e) {
      System.out.println("Error: " + e.getMessage());
      return null;
    }
  }

  public int Executar(String sql) {
    try {
      Connection conexao = DriverManager.getConnection(url, username, password);
      Statement consulta = conexao.createStatement();
      int resultado = consulta.executeUpdate(sql);
      consulta.close();
      conexao.close();
      return resultado;
    } catch (SQLException e) {
      System.out.println("Error: " + e.getMessage());
      return 0;
    }
  }
}
