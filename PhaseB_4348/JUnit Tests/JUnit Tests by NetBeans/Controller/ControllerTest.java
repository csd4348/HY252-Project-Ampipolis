/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Player.Player;
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
public class ControllerTest {
    
    public ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Control_Player_Turn method, of class Controller.
     */
    @Test
    public void testControl_Player_Turn() {
        System.out.println("Control_Player_Turn");
        Player p = null;
        Player p1 = null;
        Player p2 = null;
        Player p3 = null;
        Player p4 = null;
        Controller instance = new Controller();
        Player expResult = null;
        Player result = instance.Control_Player_Turn(p, p1, p2, p3, p4);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Which_Player_Turn method, of class Controller.
     */
    @Test
    public void testWhich_Player_Turn() {
        System.out.println("Which_Player_Turn");
        Controller instance = new Controller();
        Player expResult = null;
        Player result = instance.Which_Player_Turn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Set_Player_Turn method, of class Controller.
     */
    @Test
    public void testSet_Player_Turn() {
        System.out.println("Set_Player_Turn");
        Player p = null;
        Controller instance = new Controller();
        instance.Set_Player_Turn(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Count_Points_From_Mosaic_Tiles method, of class Controller.
     */
    @Test
    public void testCount_Points_From_Mosaic_Tiles() {
        System.out.println("Count_Points_From_Mosaic_Tiles");
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.Count_Points_From_Mosaic_Tiles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_points method, of class Controller.
     */
    @Test
    public void testGet_points() {
        System.out.println("Get_points");
        Player P = null;
        Controller instance = new Controller();
        int expResult = 0;
        int result = instance.Get_points(P);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Distribute_Tiles method, of class Controller.
     */
    @Test
    public void testDistribute_Tiles() {
        System.out.println("Distribute_Tiles");
        Player P = null;
        Controller instance = new Controller();
        instance.Distribute_Tiles(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Set_points method, of class Controller.
     */
    @Test
    public void testSet_points() {
        System.out.println("Set_points");
        Player P = null;
        Controller instance = new Controller();
        instance.Set_points(P);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_Tiles_From_Player method, of class Controller.
     */
    @Test
    public void testGet_Tiles_From_Player() {
        System.out.println("Get_Tiles_From_Player");
        Player P = null;
        Controller instance = new Controller();
        ArrayList<Tile> expResult = null;
        ArrayList<Tile> result = instance.Get_Tiles_From_Player(P);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Set_Winner method, of class Controller.
     */
    @Test
    public void testSet_Winner() {
        System.out.println("Set_Winner");
        Controller instance = new Controller();
        instance.Set_Winner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_Winner method, of class Controller.
     */
    @Test
    public void testGet_Winner() {
        System.out.println("Get_Winner");
        Controller instance = new Controller();
        Player expResult = null;
        Player result = instance.Get_Winner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Controller.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Controller.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
