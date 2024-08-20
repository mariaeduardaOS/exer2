import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class alocacaooperarioDAO {
    private Connection connection;

    public alocacaooperarioDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void alocarOperario(int idProjeto, int idOperario) throws SQLException {
        String sql = "INSERT INTO Alocacao_Operario (ID_Projeto, ID_Operario) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idprojeto);
            stmt.setInt(2, idoperario);
            stmt.executeUpdate();
        }
    }
}
