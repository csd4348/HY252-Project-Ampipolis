/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Player;

import Model.Tile.Tile;
import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnp
 */
public class PlayerTest {
    
    public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = new Player("dimitris");
        String expResult = "dimitris";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    /**
     * Test of GetPoints method, of class Player.
     */
    @Test
    public void testGetPoints() {
        System.out.println("GetPoints");
        Player instance = new Player("P1");
        instance.SetPoints(10);
        int expResult = 10;
        int result = instance.GetPoints();
        assertEquals(expResult, result);
    }
    
}
