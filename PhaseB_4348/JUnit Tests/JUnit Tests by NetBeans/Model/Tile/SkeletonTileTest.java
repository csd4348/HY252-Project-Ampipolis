/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Tile;

import java.awt.Image;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnp
 */
public class SkeletonTileTest {
    
    public SkeletonTileTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Get_Size method, of class SkeletonTile.
     */
    @Test
    public void testGet_Size() {
        System.out.println("Get_Size");
        SkeletonTile instance = null;
        String expResult = "";
        String result = instance.Get_Size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Get_Category method, of class SkeletonTile.
     */
    @Test
    public void testGet_Category() {
        System.out.println("Get_Category");
        SkeletonTile instance = null;
        String expResult = "";
        String result = instance.Get_Category();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class SkeletonTile.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        SkeletonTile instance = null;
        Image expResult = null;
        Image result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class SkeletonTile.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        Image image = null;
        SkeletonTile instance = null;
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
