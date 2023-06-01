import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "";
        String username = "";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt
                    .executeQuery("SELECT ed.*, et.descricao FROM educandos ed, etapas et where ed.etapa_id = et.id");

            while (rs.next()) {
                int id = rs.getInt("id");
                String nomeCompleto = rs.getString("nome_completo");
                String descricaoEtapa = rs.getString("descricao");

                System.out.println("ID: " + id + ", Name: " + nomeCompleto + ", Etapa: "
                        + descricaoEtapa);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
