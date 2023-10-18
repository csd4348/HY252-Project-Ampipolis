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
public class CharacterTest {
    
    public CharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Use method, of class Character.
     */
    @Test
    public void testUse() {
        System.out.println("Use");
        Character instance = new CharacterImpl();
        instance.Use();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HasBeenUsed method, of class Character.
     */
    @Test
    public void testHasBeenUsed() {
        System.out.println("HasBeenUsed");
        Character instance = new CharacterImpl();
        boolean expResult = false;
        boolean result = instance.HasBeenUsed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Category method, of class Character.
     */
    @Test
    public void testCategory() {
        System.out.println("Category");
        Character instance = new CharacterImpl();
        String expResult = "";
        String result = instance.Category();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetColour method, of class Character.
     */
    @Test
    public void testSetColour() {
        System.out.println("SetColour");
        String colour = "";
        Character instance = new CharacterImpl();
        instance.SetColour(colour);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CharacterImpl extends Character {

        public void Use() {
        }

        public boolean HasBeenUsed() {
            return false;
        }

        public String Category() {
            return "";
        }

        public void SetColour(String colour) {
        }
    }
    
}
