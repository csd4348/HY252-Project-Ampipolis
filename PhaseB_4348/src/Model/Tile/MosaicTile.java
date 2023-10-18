package Model.Tile;

import java.awt.Image;
/**
 *
 * @author johnp
 */
public class MosaicTile extends FindingTile{
    
    String type = "MosaicTile";
    String colour;

    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size
     * @param im 
     */
    public MosaicTile(String Type, String Colour, String Size, Image im) {
        super(Type, Colour, "-", "-", im);
        this.colour = Colour;
        this.image = im;
    }

    /**
     * Get the colour of the tile (helps to count points)
     */
    public String Get_Colour(){
        return this.colour;
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
    public Image getImage() {
        return this.image;
    }

    /**
     * Set the image in tile
     * @param image 
     */
    public void setImage(Image image) {
        this.image = image;
    }
}