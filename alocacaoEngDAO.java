import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class alocacaoEngDAO {
    private Connection connection;

    public alocacaoEngDAO() throws SQLException {
        this.connection = ConexaoBD.getInstance().getConnection();
    }

    public void alocarEngenheiro(int idprojeto, int ideng) throws SQLException {
        String sql = "INSERT INTO Alocacao_Engenheiro (ID_Projeto, ID_Eng) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idprojeto);
            stmt.setInt(2, ideng);
            stmt.executeUpdate();
        }
    }
}
