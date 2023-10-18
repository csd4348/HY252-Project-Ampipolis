package Model.Tile;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author johnp
 */
public class SphinxTile extends StatueTile{

    String type = "SphinxTile";

    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size
     * @param im 
     */
    public SphinxTile(String Type, String Colour, String Size, Image im) {
        super(Type, "-", "-", im);
        image = Toolkit.getDefaultToolkit().getImage("src/images_2020/sphinx.png");
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
