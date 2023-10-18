package Model.Bag;

import Model.Tile.*;
import View.GraphicUI;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author johnp
 */
public class Bag {
    public ArrayList<Tile> TilesInBag;
    private Tile T;
    /**
     * initiate the tiles of the game and add to the bag
     */
    public void Create_Tiles_For_Game(){
        
        this.TilesInBag = new ArrayList<Tile>();
        
        for(int i = 9; i > 0; i--)
        {
            T = new MosaicTile("MosaicTile", "GREEN", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_green.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 9; i > 0; i--)
        {
            T = new MosaicTile("MosaicTile", "RED", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_red.png"));      
            TilesInBag.add(T);
        }
        
        for(int i = 9; i > 0; i--)
        {
            T = new MosaicTile("MosaicTile", "YELLOW", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_yellow.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 12; i > 0; i--)
        {
            T = new CaryatidTile("CaryatidTile", "-", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/caryatid.png"));
            
            TilesInBag.add(T);
        }
        
        for(int i = 12; i > 0; i--)
        {
            T = new SphinxTile("SphinxTile", "-", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/sphinx.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 24; i > 0; i--)
        {
            T = new LandslideTile();            
            TilesInBag.add(T);
        }
        
        for(int i = 10; i > 0; i--)
        {
            T = new SkeletonTile("SkeletonTile", "-", "big", "upper", Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_big_top.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 10; i > 0; i--)
        {
            T = new SkeletonTile("SkeletonTile", "-", "big", "lower", Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_big_bottom.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new SkeletonTile("SkeletonTile", "-", "small", "upper", Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_small_top.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new SkeletonTile("SkeletonTile", "-", "small", "lower", Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_small_bottom.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "BLUE", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_blue.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "BROWN", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_brown.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "RED", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_red.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "GREEN", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_green.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "YELLOW", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_yellow.png"));            
            TilesInBag.add(T);
        }
        
        for(int i = 5; i > 0; i--)
        {
            T = new AmphoraTile("AmphoraTile", "PURPLE", "-", Toolkit.getDefaultToolkit().getImage("src/images_2020/amphora_purple.png"));            
            TilesInBag.add(T);
        } 
    }
}