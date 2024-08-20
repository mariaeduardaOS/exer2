import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class usoEquipDAO {
    private Connection connection;

    public usoEquipDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void registrarUsoEquipamento(int idProjeto, int idEquipamento) throws SQLException {
        String sql = "INSERT INTO Uso_Equipamento (ID_Projeto, ID_Equip) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idprojeto);
            stmt.setInt(2, idequip);
            stmt.executeUpdate();
        }
    }
}
