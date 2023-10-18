package Model.Tile;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author johnp
 */
public class CaryatidTile extends StatueTile{
    String type = "CaryatidTile";

    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size 
     */
    public CaryatidTile(String Type, String Colour, String Size, Image im) {
        super(Type, "-", "-", im);
        image = Toolkit.getDefaultToolkit().getImage("src/images_2020/caryatid.png");
    }

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