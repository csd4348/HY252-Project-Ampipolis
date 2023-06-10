package Model.Tile;

/**
 *
 * @author johnp
 */
public abstract class StatueTile extends FindingTile{

    public StatueTile(String Type, String Colour, String Size) {
        super(Type, Colour, Size);
    }


    @Override
    public abstract String Get_Category();
}
