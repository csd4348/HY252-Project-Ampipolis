package Model.Tile;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author johnp
 */
public class LandslideTile extends Tile{
    
    String type = "LandslideTile";
    Image image = Toolkit.getDefaultToolkit().getImage("src/images_2020/landslide.png");

    /**
     * Get the category from tile
     * @return 
     */
    @Override
    public String Get_Category() {
        return this.type;
    }
    
    /**
     * Get the image from tile
     * @return 
     */
    @Override
    public Image getImage() {
        return this.image;
    }
}
