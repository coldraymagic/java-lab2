/*  File name: DBConnection.java
*  Author: Xinwei Wang, 41104208
*  Course: CST8288-020
*  Term: Fall2024
*  Assignment: Lab2
*  Date: 12, November, 2024
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * The Class DBConnection.
 *
 * @author Xinwei Wang
 */
public class DBConnection {
    
    /** The db connection singleton. */
    private static DBConnection dbConnectionSingleton;
    
    /** The connection. */
    private Connection connection = null;
    
    /** The server url. */
    private String serverUrl = "jdbc:mysql://localhost:3306/indywinners";
    
    /** The user string. */
    private String userString = "root"; //Replace with your username
    
    /** The password string. */
    private String passwordString = "502503"; //Replace with your password
    
    /** The driver string. */
    private String driverString = "com.mysql.cj.jdbc.Driver";
    
/**
 * Instantiates a new DB connection.
 */
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

    
/**
 * Gets the single instance of DBConnection.
 *
 * @return single instance of DBConnection
 * @throws SQLException the SQL exception
 */
public static DBConnection getInstance() throws SQLException {
    if (dbConnectionSingleton == null || dbConnectionSingleton.getConnection() == null) {
        dbConnectionSingleton = new DBConnection();
    }
    return dbConnectionSingleton;
}


    /**
     * Gets the connection.
     *
     * @return the connection
     */
    public Connection getConnection() {
	return connection;
    }   
		        
    
}
