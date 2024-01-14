package Labworks.LabEx10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WampDatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/farm";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
                if (connection != null) {
                    System.out.println("Connected to the database!");
                    // Your database operations go here
                } else {
                    System.out.println("Failed to connect to the database.");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}