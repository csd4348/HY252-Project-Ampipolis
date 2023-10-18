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
        Controller instance = new Controller();
        Player p;
        Player p1 = instance.P1;
        Player p2 = instance.P2;
        Player p3 = instance.P3;
        Player p4 = instance.P4;
        Player expResult = p4;
        Player result = instance.Control_Player_Turn(p3, p1, p2, p3, p4);
        assertEquals(expResult, result);

    }

    /**
     * Test of Get_points method, of class Controller.
     */
    @Test
    public void testGet_points() {
        System.out.println("Get_points");
        Controller instance = new Controller();
        Player P = instance.P1;
        instance.P1.SetPoints(10);
        int expResult = 10;
        int result = instance.P1.GetPoints();
        assertEquals(expResult, result);

    }   
}