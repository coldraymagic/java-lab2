/*  File name: IndyWinnerDAO.java
*  Author: Xinwei Wang, 41104208
*  Course: CST8288-020
*  Term: Fall2024
*  Assignment: Lab2
*  Date: 12, November, 2024
*/

import java.util.List;



/**
 * The Interface IndyWinnerDAO.
 *
 * @author Xinwei Wang
 */
public interface IndyWinnerDAO {
    
    /**
     * Display ten records fetch from database
     *
     * @param page the page
     * @return the list
     */
    public List<IndyWinnerTeam> display(int page);
}

    

