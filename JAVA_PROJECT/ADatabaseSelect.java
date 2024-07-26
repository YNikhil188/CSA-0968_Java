import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ADatabaseSelect {
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
                // Create a SQL query to select data
                String sql = "SELECT * FROM Policies WHERE policy_id = ?";
                
                // Create a PreparedStatement for setting parameters
                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                    // Set the value for the policy_id to select
                    pstmt.setInt(1, 4); // Assuming we are selecting the record with policy_id = 1
                    
                    // Execute the query
                    ResultSet rs = pstmt.executeQuery();
                    
                    // Process the ResultSet
                    if (rs.next()) {
                        System.out.println("Record found:");
                        System.out.println("policy_id: " + rs.getInt("policy_id"));
                        System.out.println("policy_number: " + rs.getString("policy_number"));
                        System.out.println("policy_holder_name: " + rs.getString("policy_holder_name"));
                        System.out.println("policy_type: " + rs.getString("policy_type"));
                        System.out.println("start_date: " + rs.getDate("start_date"));
                        System.out.println("end_date: " + rs.getDate("end_date"));
                        System.out.println("premium_amount: " + rs.getBigDecimal("premium_amount"));
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
