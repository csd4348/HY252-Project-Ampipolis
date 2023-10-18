/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Tile;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author johnp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Model.Tile.LandslideTileTest.class, Model.Tile.SphinxTileTest.class, Model.Tile.CaryatidTileTest.class, Model.Tile.AmphoraTileTest.class, Model.Tile.MosaicTileTest.class, Model.Tile.FindingTileTest.class, Model.Tile.TileTest.class, Model.Tile.SkeletonTileTest.class, Model.Tile.StatueTileTest.class})
public class TileSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
