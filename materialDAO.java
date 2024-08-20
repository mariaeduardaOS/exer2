import java.sql.*;

public class materialDAO {
    private Connection connection;

    public materialDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirMaterial(Material material) throws SQLException {
        String sql = "INSERT INTO Material (ID_Material, Nome_Material, Quantidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, material.getIdMaterial());
            stmt.setString(2, material.getNomeMaterial());
            stmt.setInt(3, material.getQuantidade());
            stmt.executeUpdate();
        }
    }
}
