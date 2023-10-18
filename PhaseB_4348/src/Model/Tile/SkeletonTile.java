package Model.Tile;

import java.awt.Image;
/**
 *
 * @author johnp
 */
public class SkeletonTile extends FindingTile{

    String type = "SkeletonTile";
    String size;
    
    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size
     * @param body
     * @param im 
     */
    public SkeletonTile(String Type, String Colour, String Size, String body, Image im) {
        super(Type, "-", Size, body, im);
        this.size = Size;
        this.image = im;
    }
        
    /**
     * Get the size of the tile (helps to count points)
     * @return the size of skeleton tile
     */
    public String Get_Size(){
        return this.size;
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

    /**
     * Set the image in tile
     * @param image 
     */
    public void setImage(Image image) {
        this.image = image;
    }
}