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
public class ProfessorTest {
    
    public ProfessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Use method, of class Professor.
     */
    @Test
    public void testUse() {
        System.out.println("Use");
        Professor instance = new Professor();
        instance.Use();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HasBeenUsed method, of class Professor.
     */
    @Test
    public void testHasBeenUsed() {
        System.out.println("HasBeenUsed");
        Professor instance = new Professor();
        boolean expResult = false;
        boolean result = instance.HasBeenUsed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetColour method, of class Professor.
     */
    @Test
    public void testSetColour() {
        System.out.println("SetColour");
        String colour = "";
        Professor instance = new Professor();
        instance.SetColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Category method, of class Professor.
     */
    @Test
    public void testCategory() {
        System.out.println("Category");
        Professor instance = new Professor();
        String expResult = "";
        String result = instance.Category();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
