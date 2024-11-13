/*  File name: IndyWinnerTeam.java
*  Author: Xinwei Wang, 41104208
*  Course: CST8288-020
*  Term: Fall2024
*  Assignment: Lab2
*  Date: 12, November, 2024
*/


/**
 * The Class IndyWinnerTeam.
 *
 * @author Xinwei Wang
 */
public class IndyWinnerTeam {
    
    /** The year. */
    private int year;
    
    /** The driver. */
    private String driver;
    
    /** The average speed. */
    private double averageSpeed;
    
    /** The country. */
    private String country;
    
    /**
     * Instantiates a new indy winner team.
     *
     * @param year the year
     * @param driver the driver
     * @param averageSpeed the average speed
     * @param country the country
     */
    public IndyWinnerTeam(int year, String driver, double averageSpeed, String country){
        this.year=year;
        this.driver=driver;
        this.averageSpeed=averageSpeed;
        this.country=country;
    }
    
    /**
     * Instantiates a new indy winner team.
     */
    public IndyWinnerTeam(){
        this.year=0;
        this.driver="";
        this.averageSpeed=0.0;
        this.country="";
    }

    /**
     * Gets the year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the driver.
     *
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Gets the average speed.
     *
     * @return the average speed
     */
    public double getAverageSpeed() {
        return averageSpeed;
    }

    /**
     * Gets the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the year.
     *
     * @param year the new year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Sets the driver.
     *
     * @param driver the new driver
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * Sets the average speed.
     *
     * @param averageSpeed the new average speed
     */
    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    /**
     * Sets the country.
     *
     * @param country the new country
     */
    public void setCountry(String country) {
        this.country = country;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    public String toString(){
        return String.format("[id: %d, driver: %s, average speed: %f, country: %s]", year,driver,averageSpeed,country);
    }
    
}
