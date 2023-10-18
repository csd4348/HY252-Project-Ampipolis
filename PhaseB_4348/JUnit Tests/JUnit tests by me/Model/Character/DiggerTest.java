/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Character;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnp
 */
public class DiggerTest {
    
    public DiggerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of HasBeenUsed method, of class Digger.
     */
    @Test
    public void testHasBeenUsed() {
        System.out.println("HasBeenUsed");
        Digger instance = new Digger();
        instance.Use();
        boolean expResult = true;
        boolean result = instance.HasBeenUsed();
        assertEquals(expResult, result);
    }

    /**
     * Test of Category method, of class Digger.
     */
    @Test
    public void testCategory() {
        System.out.println("Category");
        Digger instance = new Digger();
        String expResult = "Digger";
        String result = instance.Category();
        assertEquals(expResult, result);
    }
    
}
