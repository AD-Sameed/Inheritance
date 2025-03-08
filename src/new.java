import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class MySQLConnect {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/pass";
        String username = "root";
        String password = "86200786";

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the MySQL database successfully!");

            // Read user input for new record
            System.out.print("Enter student ID (integer): ");
            int studentId = Integer.parseInt(scanner.nextLine());
            
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Enter marks (integer): ");
            int studentMarks = Integer.parseInt(scanner.nextLine());

            // Prepare SQL statement for inserting data
            String insertSQL = "INSERT INTO marks (student_id, student_name, marks) VALUES (?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertSQL);
            insertStmt.setInt(1, studentId);
            insertStmt.setString(2, studentName);
            insertStmt.setInt(3, studentMarks);
            
            // Execute the insert
            int rowsInserted = insertStmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new record was inserted successfully!");
            }
            
            // Create a statement object to perform a query for displaying the data
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM marks");

            // Display results
            System.out.println("\nCurrent data in the 'marks' table:");
            while (resultSet.next()) {
                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("student_name");
                int marks = resultSet.getInt("marks");
                System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
            }

            // Clean up by closing the resources
            resultSet.close();
            statement.close();
            insertStmt.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
