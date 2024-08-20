
import java.sql.*;

public class engDAO {
    private Connection connection;

    public engDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void inserirEng(eng eng) throws SQLException {
        String sql = "INSERT INTO Engenheiro (ID_Eng, Nome_Eng, Especialidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, eng.getidEng());
            stmt.setString(2, eng.getnomeEng());
            stmt.setString(3, eng.getEspecialidade());
            stmt.executeUpdate();
        }
    }
}
