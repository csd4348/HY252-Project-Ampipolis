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
public class ArchaeologistTest {
    
    public ArchaeologistTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Use method, of class Archaeologist.
     */
    @Test
    public void testUse() {
        System.out.println("Use");
        Archaeologist instance = new Archaeologist();
        instance.Use();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HasBeenUsed method, of class Archaeologist.
     */
    @Test
    public void testHasBeenUsed() {
        System.out.println("HasBeenUsed");
        Archaeologist instance = new Archaeologist();
        boolean expResult = false;
        boolean result = instance.HasBeenUsed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetColour method, of class Archaeologist.
     */
    @Test
    public void testSetColour() {
        System.out.println("SetColour");
        String colour = "";
        Archaeologist instance = new Archaeologist();
        instance.SetColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Category method, of class Archaeologist.
     */
    @Test
    public void testCategory() {
        System.out.println("Category");
        Archaeologist instance = new Archaeologist();
        String expResult = "";
        String result = instance.Category();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
