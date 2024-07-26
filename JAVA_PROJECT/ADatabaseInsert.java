import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ADatabaseInsert {
    public static void main(String[] args) {
        // Replace with your database details
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "qwert@";
        
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            try (Connection conn = DriverManager.getConnection(url, username, password)) {
                // Create a SQL query to insert data
                String sql = "INSERT INTO Policies (policy_number, policy_holder_name, policy_type, start_date, end_date, premium_amount) VALUES (?, ?, ?, ?, ?, ?)";
                
                // Create a PreparedStatement for setting parameters
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    // Set the values for the columns
                    pstmt.setString(1, "POL123456"); // policy_number
                    pstmt.setString(2, "John Doe"); // policy_holder_name
                    pstmt.setString(3, "Health"); // policy_type
                    pstmt.setDate(4, java.sql.Date.valueOf("2023-01-01")); // start_date
                    pstmt.setDate(5, java.sql.Date.valueOf("2024-01-01")); // end_date
                    pstmt.setBigDecimal(6, new java.math.BigDecimal("500.00")); // premium_amount
                    
                    // Execute the insert statement
                    pstmt.executeUpdate();
                    System.out.println("Record inserted successfully");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query failed!");
            e.printStackTrace();
        }
    }
}
