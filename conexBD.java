import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexBD {
    private static ConexBD instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/empresa_construcao";
    private String username = "root";
    private String password = "password";

    private ConexBD() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException("Erro na conexão com o banco de dados.");
        }
    }

    public static ConexBD getInstance() throws SQLException {
        if (instance == null) {
            instance = new ConexBD();
        } else if (instance.getConnection().isClosed()) {
            instance = new ConexBD();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
