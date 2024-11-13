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
 * @author Xinwei Wang
 */
public class IndyWinnerTeamTest {
    
    public IndyWinnerTeamTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getYear method, of class IndyWinnerTeam.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        IndyWinnerTeam instance = new IndyWinnerTeam(1911,"Ray Harroun",74.602,"USA");
        int expResult = 1911;
        int result = instance.getYear();
        assertEquals(expResult, result);

    }

    /**
     * Test of getDriver method, of class IndyWinnerTeam.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        IndyWinnerTeam instance = new IndyWinnerTeam(1911,"Ray Harroun",74.602,"USA");
        String expResult = "Ray Harroun";
        String result = instance.getDriver();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAverageSpeed method, of class IndyWinnerTeam.
     */
    @Test
    public void testGetAverageSpeed() {
        System.out.println("getAverageSpeed");
        IndyWinnerTeam instance = new IndyWinnerTeam(1911,"Ray Harroun",74.602,"USA");
        double expResult = 74.602;
        double result = instance.getAverageSpeed();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of getCountry method, of class IndyWinnerTeam.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        IndyWinnerTeam instance = new IndyWinnerTeam(1911,"Ray Harroun",74.602,"USA");
        String expResult = "USA";
        String result = instance.getCountry();
        assertEquals(expResult, result);

    }
 }
