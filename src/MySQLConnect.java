import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLConnect {
    public static void main(String[] args) {
        // Replace these variables with your actual database credentials
        String url = "jdbc:mysql://localhost:3306/pass";
        String username = "root";
        String password = "86200786";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the MySQL database successfully!");

            // Create a statement object
            Statement statement = connection.createStatement();

            // Create the students table if it does not exist
            String createTableSQL = "CREATE TABLE IF NOT EXISTS hello (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100) NOT NULL, " +
                    "age INT NOT NULL, " +
                    "grade VARCHAR(10) NOT NULL)";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'students' is ready.");

            // Clean up by closing the resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
