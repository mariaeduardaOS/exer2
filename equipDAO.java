import java.sql.*;

public class equipDAO {
    private Connection connection;

    public equipDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirEquipamento(equipDAO equipamento) throws SQLException {
        String sql = "INSERT INTO Equipamento (ID_Equipamento, Nome_Equipamento, Tipo) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, equipamento.getIdEquipamento());
            stmt.setString(2, equipamento.getNomeEquipamento());
            stmt.setString(3, equipamento.getTipo());
            stmt.executeUpdate();
        }
    }

    private int getIdEquipamento() {
        throw new UnsupportedOperationException("Unimplemented method 'getIdEquipamento'");
    }

    private String getNomeEquipamento() {
        throw new UnsupportedOperationException("Unimplemented method 'getNomeEquipamento'");
    }

    private String getTipo() {
        throw new UnsupportedOperationException("Unimplemented method 'getTipo'");
    }
}
