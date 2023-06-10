package Model.Tile;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class SphinxTile extends StatueTile{

    String type = "SphinxTile";
    
    public SphinxTile(String Type, String Colour, String Size) {
        super(Type, "-", "-");
    }

    @Override
    public String Get_Category() {
        return this.type;
    }
    
}
