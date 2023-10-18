/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnp
 */
public class GraphicUITest {
    
    public GraphicUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CreateCharacterButtons method, of class GraphicUI.
     */
    @Test
    public void testCreateCharacterButtons() throws IOException {
        System.out.println("CreateCharacterButtons");
        GraphicUI instance = new GraphicUI();
        instance.CreateCharacterButtons();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InitComponents method, of class GraphicUI.
     */
    @Test
    public void testInitComponents() throws IOException {
        System.out.println("InitComponents");
        GraphicUI instance = new GraphicUI();
        instance.InitComponents();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRandomNumber method, of class GraphicUI.
     */
    @Test
    public void testGetRandomNumber() throws IOException {
        System.out.println("getRandomNumber");
        int min = 0;
        int max = 0;
        GraphicUI instance = new GraphicUI();
        int expResult = 0;
        int result = instance.getRandomNumber(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
