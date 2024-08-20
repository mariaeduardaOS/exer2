import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class consumoMaterialDAO {
    private Connection connection;

    public consumoMaterialDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void registrarConsumoMaterial(int idProjeto, int idMaterial) throws SQLException {
        String sql = "INSERT INTO Consumo_Material (ID_Projeto, ID_Material) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idprojeto);
            stmt.setInt(2, idmaterial);
            stmt.executeUpdate();
        }
    }
}
