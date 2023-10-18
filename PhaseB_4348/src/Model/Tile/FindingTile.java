package Model.Tile;

import java.awt.Image;

/**
 *
 * @author johnp
 */
public abstract class FindingTile extends Tile{
    
    private String type;
    private String colour = "-";
    private String size = "-";
    private String body = "-";
    public Image image;
    
    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size
     */
    public FindingTile(String Type, String Colour, String Size, String body, Image im){
        this.type = Type;
        
        if(Type.compareTo("AmphoraTile") == 0 || Type.compareTo("MosaicTile") == 0){
            this.colour = Colour;
        }
    
        if(Type.equals("SkeletonTile")){
            this.size = Size;
        }
        this.image = im;
    }


    @Override
    public abstract String Get_Category();
}
