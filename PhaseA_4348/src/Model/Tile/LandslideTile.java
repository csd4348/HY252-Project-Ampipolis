package Model.Tile;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class LandslideTile extends Tile{
    
    String type = "LandslideTile";

    @Override
    public String Get_Category() {
        return this.type;
    }
    
}
