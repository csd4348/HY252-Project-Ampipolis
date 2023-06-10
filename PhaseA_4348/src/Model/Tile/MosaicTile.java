package Model.Tile;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class MosaicTile extends FindingTile{
    
    String type = "MosaicTile";
    String colour;

    public MosaicTile(String Type, String Colour, String Size) {
        super(Type, Colour, "-");
        this.colour = Colour;
    }
    
    
    /**
     * Get the colour of the tile (helps to count points)
     */
    public String Get_Colour(){
        return this.colour;
    }

    @Override
    public String Get_Category() {
        return this.type;
    }

}
