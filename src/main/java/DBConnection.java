import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class DBConnection{
    public static void main(String[] args) {
        String url = "jdbc:sqlite:path-to-db/example/example.db";
        try (Connection conn = DriverManager.getConnection(url)){
            System.out.println("Connected");

        } catch (SQLException error) {
            throw new Error("Problem", error);
        }
    }
}