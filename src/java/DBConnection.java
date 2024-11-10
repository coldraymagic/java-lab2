
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coldr
 */
public class DBConnection {
    private static DBConnection dbConnectionSingleton;
    
    private Connection connection = null;
    private String serverUrl = "jdbc:mysql://localhost:3306/indywinners";
    private String userString = "root"; //Replace with your username
    private String passwordString = "502503"; //Replace with your password
    private String driverString = "com.mysql.cj.jdbc.Driver";
    
private DBConnection() {
    try {
        Class.forName(driverString);
        this.connection = DriverManager.getConnection(serverUrl, userString, passwordString);
        System.out.println("Database connection established successfully.");
    } catch (ClassNotFoundException ex) {
        System.out.println("Database driver not found: " + ex.getMessage());
        ex.printStackTrace();
    } catch (SQLException ex) {
        System.out.println("Failed to connect to the database: " + ex.getMessage());
        ex.printStackTrace();
    }
}

    
public static DBConnection getInstance() throws SQLException {
    if (dbConnectionSingleton == null || dbConnectionSingleton.getConnection() == null) {
        dbConnectionSingleton = new DBConnection();
    }
    return dbConnectionSingleton;
}


    public Connection getConnection() {
	return connection;
    }   
		        
    
}
