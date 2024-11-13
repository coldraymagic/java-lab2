/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.sql.Connection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author coldr
 */
public class DBConnectionTest {
    
    public DBConnectionTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test Singleton
     */
    @Test
    public void testGetInstance() throws Exception {
        System.out.println("getInstance");
        DBConnection expResult = DBConnection.getInstance();
        DBConnection result = DBConnection.getInstance();
        assertEquals(expResult, result);

    }


    
}
