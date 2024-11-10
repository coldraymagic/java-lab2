/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author coldr
 */
public class IndyWinnerDAOImp implements IndyWinnerDAO{
    private Connection connection;
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
