import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ADatabaseDelete {
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
                // Create a SQL query to delete data
                String sql = "DELETE FROM Policies WHERE policy_id = ?";
                
                // Create a PreparedStatement for setting parameters
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    // Set the value for the policy_id to be deleted
                    pstmt.setInt(1, 3); // Assuming we are deleting the record with policy_id = 1
                    
                    // Execute the delete statement
                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        System.out.println("Record deleted successfully");
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
