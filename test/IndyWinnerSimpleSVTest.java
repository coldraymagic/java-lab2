/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coldr
 */
public class IndyWinnerSimpleSVTest {
    
    public IndyWinnerSimpleSVTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getServletInfo method, of class IndyWinnerSimpleSV.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        IndyWinnerSimpleSV instance = new IndyWinnerSimpleSV();
        System.out.println(instance.getServletInfo());
        int expResult = 0;
        int result = instance.getServletInfo().length();
        assertNotEquals(expResult, result);

    }
    
}
