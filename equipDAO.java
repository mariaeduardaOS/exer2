import java.sql.*;

public class EquipDAO {
    private Connection connection;

    public EquipDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirEquipamento(Equipamento equipamento) throws SQLException {
        String sql = "INSERT INTO Equipamento (ID_Equipamento, Nome_Equipamento, Tipo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, equipamento.getIdEquipamento());
            stmt.setString(2, equipamento.getNomeEquipamento());
            stmt.setString(3, equipamento.getTipo());
            stmt.executeUpdate();
        }
    }
}
