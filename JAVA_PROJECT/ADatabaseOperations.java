import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.math.BigDecimal;

public class ADatabaseOperations {
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
                Scanner scanner = new Scanner(System.in);
                int choice;
                
                do {
                    System.out.println("Select operation: 1-Insert, 2-Delete, 3-Update, 4-Select, 5-Exit");
                    choice = scanner.nextInt();
                    
                    switch (choice) {
                        case 1:
                            insertRecord(conn, scanner);
                            break;
                        case 2:
                            deleteRecord(conn, scanner);
                            break;
                        case 3:
                            updateRecord(conn, scanner);
                            break;
                        case 4:
                            selectRecord(conn, scanner);
                            break;
                        case 5:
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                } while (choice != 5);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection or query failed!");
            e.printStackTrace();
        }
    }

    public static void insertRecord(Connection conn, Scanner scanner) {
        String sql = "INSERT INTO Policies (policy_number, policy_holder_name, policy_type, start_date, end_date, premium_amount) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter policy number: ");
            String policyNumber = scanner.next();
            System.out.print("Enter policy holder name: ");
            String policyHolderName = scanner.next();
            System.out.print("Enter policy type: ");
            String policyType = scanner.next();
            System.out.print("Enter start date (yyyy-mm-dd): ");
            String startDate = scanner.next();
            System.out.print("Enter end date (yyyy-mm-dd): ");
            String endDate = scanner.next();
            System.out.print("Enter premium amount: ");
            BigDecimal premiumAmount = scanner.nextBigDecimal();
            
            pstmt.setString(1, policyNumber);
            pstmt.setString(2, policyHolderName);
            pstmt.setString(3, policyType);
            pstmt.setDate(4, java.sql.Date.valueOf(startDate));
            pstmt.setDate(5, java.sql.Date.valueOf(endDate));
            pstmt.setBigDecimal(6, premiumAmount);
            
            pstmt.executeUpdate();
            System.out.println("Record inserted successfully");
        } catch (SQLException e) {
            System.out.println("Insert operation failed!");
            e.printStackTrace();
        }
    }

    public static void deleteRecord(Connection conn, Scanner scanner) {
        String sql = "DELETE FROM Policies WHERE policy_id = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter policy ID to delete: ");
            int policyId = scanner.nextInt();
            
            pstmt.setInt(1, policyId);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("No record found with the given policy ID");
            }
        } catch (SQLException e) {
            System.out.println("Delete operation failed!");
            e.printStackTrace();
        }
    }

    public static void updateRecord(Connection conn, Scanner scanner) {
        String sql = "UPDATE Policies SET policy_holder_name = ?, policy_type = ?, start_date = ?, end_date = ?, premium_amount = ? WHERE policy_id = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter policy ID to update: ");
            int policyId = scanner.nextInt();
            System.out.print("Enter new policy holder name: ");
            String policyHolderName = scanner.next();
            System.out.print("Enter new policy type: ");
            String policyType = scanner.next();
            System.out.print("Enter new start date (yyyy-mm-dd): ");
            String startDate = scanner.next();
            System.out.print("Enter new end date (yyyy-mm-dd): ");
            String endDate = scanner.next();
            System.out.print("Enter new premium amount: ");
            BigDecimal premiumAmount = scanner.nextBigDecimal();
            
            pstmt.setString(1, policyHolderName);
            pstmt.setString(2, policyType);
            pstmt.setDate(3, java.sql.Date.valueOf(startDate));
            pstmt.setDate(4, java.sql.Date.valueOf(endDate));
            pstmt.setBigDecimal(5, premiumAmount);
            pstmt.setInt(6, policyId);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("No record found with the given policy ID");
            }
        } catch (SQLException e) {
            System.out.println("Update operation failed!");
            e.printStackTrace();
        }
    }

    public static void selectRecord(Connection conn, Scanner scanner) {
        String sql = "SELECT * FROM Policies WHERE policy_id = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            System.out.print("Enter policy ID to select: ");
            int policyId = scanner.nextInt();
            
            pstmt.setInt(1, policyId);
            
            ResultSet rs = pstmt.executeQuery();
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
                System.out.println("No record found with the given policy ID");
            }
        } catch (SQLException e) {
            System.out.println("Select operation failed!");
            e.printStackTrace();
        }
    }
}
