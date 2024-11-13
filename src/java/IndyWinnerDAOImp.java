/*  File name: IndyWinnerDAOImp.java
*  Author: Xinwei Wang, 41104208
*  Course: CST8288-020
*  Term: Fall2024
*  Assignment: Lab2
*  Date: 12, November, 2024
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class IndyWinnerDAOImp.
 *
 * @author Xinwei Wang
 */
public class IndyWinnerDAOImp implements IndyWinnerDAO{
    
    /** The connection. */
    private Connection connection;

/**
 * Instantiates a new indy winner DAO imp.
 */
public IndyWinnerDAOImp() {
    try {
        this.connection = DBConnection.getInstance().getConnection();
        if (this.connection == null) {
            System.out.println("Failed to establish database connection.");
        } else {
            System.out.println("Database connection established successfully.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    

    
    /**
     * Display.
     *
     * @param page the page
     * @return the list
     */
    @Override
    public List<IndyWinnerTeam> display(int page) {
            List<IndyWinnerTeam> teams = new ArrayList<>();
            

            try {
                System.out.println(connection);
                Statement stmt = connection.createStatement();
                String query = "SELECT * FROM IndyWinners limit "+page*10+",10";
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    IndyWinnerTeam team=new IndyWinnerTeam();
                    team.setYear(rs.getInt("year"));
                    team.setDriver(rs.getString("driver"));
                    team.setAverageSpeed(rs.getDouble("averagespeed"));
                    team.setCountry(rs.getString("country"));
                    teams.add(team);
                }
                rs.close();
                
            } catch (SQLException ex) { 
            }
            return teams;
	}
    
    
    
}
