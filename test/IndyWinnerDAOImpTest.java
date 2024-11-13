/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coldr
 */
public class IndyWinnerDAOImpTest {
    
    public IndyWinnerDAOImpTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of display method, of class IndyWinnerDAOImp.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        int page = 0;
        IndyWinnerDAO instance = new IndyWinnerDAOImp();
        int expResult = 10;
        int result = instance.display(page).size();
        System.out.println(result);
        assertEquals(expResult, result);

    }
    
}
