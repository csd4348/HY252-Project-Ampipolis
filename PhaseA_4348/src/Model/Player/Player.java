package Model.Player;

import java.util.ArrayList;
import Model.Character.Character;
import Model.Character.Assistant;
import Model.Character.Archaeologist;
import Model.Character.Digger;
import Model.Character.Professor;
import Model.Tile.Tile;
import View.GraphicUI;


/**
 *
 * @author johnp
 */
public class Player {
    private String name;
    public ArrayList<Character> Characters_per_Player = new ArrayList<Character>(4);
    public ArrayList<Tile> Tiles = new ArrayList<Tile>();
    private int points;
    
    /**
     * constructor that initiate the name and the 4 characters to player
     * @param name 
     */
    public Player(String name)
    {
        this.name = name;
        SetCharactersToPlayer();
    }
    
    /**
     * initiate the characters to player
     */
    public void SetCharactersToPlayer()
    {
        Characters_per_Player.add(new Assistant());
        Characters_per_Player.add(new Archaeologist());
        Characters_per_Player.add(new Digger());
        Characters_per_Player.add(new Professor());
    }
    
    /**
     * initiate the tiles to player
     */
    public void SetTilesToPlayer()
    {
        
    }
    
    /**
     * 
     * @return tiles that a player has
     */
    public Tile GetTilesFromPlayer()
    {
        Tile t = null;
        return t;
    }
    
    /**
     * Set the new name of the player
     * @param newName 
     */
    public void setName(String newName) 
    {
        this.name = newName;
    }
    
    /**
     * 
     * @return the name of the player
     */
    public String getName() 
    {
        return name;
    }
    
    /**
     * Change the points on a player 
     */
    public void SetPoints()
    {
        
    }
    
    /**
     * 
     * @return points that a player has
     */
    public int GetPoints()
    {
        int points=0;
        // ...
        return points;
    }
    
}
