package Model.Tile;

/**
 *
 * @author johnp
 */
public abstract class FindingTile extends Tile{
    
    private String type;
    private String colour = "-";
    private String size = "-";
    
    /**
     * Constructor
     * @param Type
     * @param Colour
     * @param Size
     */
    public FindingTile(String Type, String Colour, String Size){
        this.type = Type;
        
        if(Type.compareTo("AmphoraTile") == 0 || Type.compareTo("MosaicTile") == 0){
            this.colour = Colour;
        }
    
        if(Type.equals("SkeletonTile")){
            this.size = Size;
        }
    }


    @Override
    public abstract String Get_Category();
}
