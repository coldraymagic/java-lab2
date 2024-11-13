/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author coldr
 */
public class IndyWinnerTeam {
    private int year;
    private String driver;
    private double averageSpeed;
    private String country;
    
    public IndyWinnerTeam(int year, String driver, double averageSpeed, String country){
        this.year=year;
        this.driver=driver;
        this.averageSpeed=averageSpeed;
        this.country=country;
    }
    
    public IndyWinnerTeam(){
        this.year=0;
        this.driver="";
        this.averageSpeed=0.0;
        this.country="";
    }

    public int getYear() {
        return year;
    }

    public String getDriver() {
        return driver;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String toString(){
        return String.format("[id: %d, driver: %s, average speed: %f, country: %s]", year,driver,averageSpeed,country);
    }
    
}
