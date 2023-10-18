/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Tile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnp
 */
public class FindingTileTest {
    
    public FindingTileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Get_Category method, of class FindingTile.
     */
    @Test
    public void testGet_Category() {
        System.out.println("Get_Category");
        FindingTile instance = null;
        String expResult = "";
        String result = instance.Get_Category();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public abstract class FindingTileImpl extends FindingTile {

        public FindingTileImpl() {
            super("", "", "", "", null);
        }

        public String Get_Category() {
            return "";
        }
    }
    
}
