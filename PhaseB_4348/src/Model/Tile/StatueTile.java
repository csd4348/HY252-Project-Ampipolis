package Model.Tile;

import java.awt.Image;

/**
 *
 * @author johnp
 */
public abstract class StatueTile extends FindingTile{
    
    public StatueTile(String Type, String Colour, String Size, Image im) {
        super(Type, "-", "-", "-", im);
    }

    @Override
    public abstract String Get_Category();
}
