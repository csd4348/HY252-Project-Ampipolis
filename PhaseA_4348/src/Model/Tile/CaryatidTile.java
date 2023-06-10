package Model.Tile;

import View.GraphicUI;
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
    public CaryatidTile(String Type, String Colour, String Size) {
        super(Type, "-", "-");
    }

    @Override
    public String Get_Category() {
        return this.type;
    }
    
}
