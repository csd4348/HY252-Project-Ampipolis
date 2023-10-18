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
    private ArrayList<Tile> Tiles;
    private int points;
    
    /**
     * constructor that initiate the name and the 4 characters to player
     * @param name 
     */
    public Player(String name)
    {
        this.name = name;
        Tiles = new ArrayList<Tile>();
        SetCharactersToPlayer();
        this.points = 0;
    }
    
    /**
     * initiate the characters to player
     */
    public void SetCharactersToPlayer()
    {
        Characters_per_Player.add(new Archaeologist());
        Characters_per_Player.add(new Assistant());
        Characters_per_Player.add(new Digger());
        Characters_per_Player.add(new Professor());
    }
    
    /**
     * initiate the tiles to player
     * @param tile
     */
    public void AddTileToPlayer(Tile tile)
    {
        this.Tiles.add(tile);
    }
    
    /**
     * 
     * @return tiles that a player has
     */
    public ArrayList<Tile> GetTilesFromPlayer()
    {
        return Tiles;
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
        return this.name;
    }
    
    /**
     * Change the points on a player 
     * @param p
     */
    public void SetPoints(int p)
    {
        this.points = p;
    }
    
    /**
     * 
     * @return points that a player has
     */
    public int GetPoints()
    {
        return this.points;
    }
}