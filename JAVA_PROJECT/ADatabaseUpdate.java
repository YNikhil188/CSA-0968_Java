import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ADatabaseUpdate {
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
                // Create a SQL query to update data
                String sql = "UPDATE Policies SET policy_holder_name = ?, policy_type = ?, start_date = ?, end_date = ?, premium_amount = ? WHERE policy_id = ?";
                
                // Create a PreparedStatement for setting parameters
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    // Set the values for the columns to be updated
                    pstmt.setInt(1, 4); // The policy_id of the record to be updated
                    pstmt.setString(2, "Jane Doe"); // New policy_holder_name
                    pstmt.setString(3, "Life"); // New policy_type
                    pstmt.setDate(4, java.sql.Date.valueOf("2023-02-01")); // New start_date
                    pstmt.setDate(5, java.sql.Date.valueOf("2024-02-01")); // New end_date
                    pstmt.setBigDecimal(6, new java.math.BigDecimal("600.00")); // New premium_amount
                    
                    // Execute the update statement
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Record updated successfully");
                    } else {
                        System.out.println("No record found with the given policy_id");
                    }
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
