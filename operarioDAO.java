import java.sql.*;

public class operarioDAO {
    private Connection connection;

    public operarioDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirOperario(operario operario) throws SQLException {
        String sql = "INSERT INTO Operario (ID_Operario, Nome_Operario, Funcao) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, operario.getIdoperario());
            stmt.setString(2, operario.getnomeoperario());
            stmt.setString(3, operario.getFuncao());
            stmt.executeUpdate();
        }
    }
}
