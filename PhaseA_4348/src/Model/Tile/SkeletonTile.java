package Model.Tile;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class SkeletonTile extends FindingTile{

    String type = "SkeletonTile";
    String size;
    
    public SkeletonTile(String Type, String Colour, String Size) {
        super(Type, "-", Size);
        this.size = Size;
    }
        
    /**
     * Get the size of the tile (helps to count points)
     * @return the size of skeleton tile
     */
    public String Get_Size(){
        return this.size;
    }

    @Override
    public String Get_Category() {
        return this.type;
    }
}