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
     * Test of SetCharactersToPlayer method, of class Player.
     */
    @Test
    public void testSetCharactersToPlayer() {
        System.out.println("SetCharactersToPlayer");
        Player instance = null;
        instance.SetCharactersToPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddTileToPlayer method, of class Player.
     */
    @Test
    public void testAddTileToPlayer() {
        System.out.println("AddTileToPlayer");
        Tile tile = null;
        Player instance = null;
        instance.AddTileToPlayer(tile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetTilesFromPlayer method, of class Player.
     */
    @Test
    public void testGetTilesFromPlayer() {
        System.out.println("GetTilesFromPlayer");
        Player instance = null;
        ArrayList<Tile> expResult = null;
        ArrayList<Tile> result = instance.GetTilesFromPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "";
        Player instance = null;
        instance.setName(newName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Player instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetPoints method, of class Player.
     */
    @Test
    public void testSetPoints() {
        System.out.println("SetPoints");
        int p = 0;
        Player instance = null;
        instance.SetPoints(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPoints method, of class Player.
     */
    @Test
    public void testGetPoints() {
        System.out.println("GetPoints");
        Player instance = null;
        int expResult = 0;
        int result = instance.GetPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
