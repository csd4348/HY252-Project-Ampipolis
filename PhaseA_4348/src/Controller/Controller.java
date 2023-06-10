package Controller;

import Model.Player.Player;
import Model.Tile.Tile.*;
import Model.Character.*;
import Model.Board.Board;
import Model.Bag.Bag;
import java.util.ArrayList;

/**
 *
 * @author johnp
 */
public class Controller {
    
    private Player P1,P3,P2,P4;
    private ArrayList <Player> players = new ArrayList<Player>();
    private Bag B;
    private int points;
    /**
     * The constructor of controller class that define the game 
     */
    public Controller(){
        P1 = new Player("p1");
        P2 = new Player("p2");
        P3 = new Player("p3");
        P4 = new Player("p4");
        players.add(P1);
        players.add(P2);
        players.add(P3);
        players.add(P4);
        B = new Bag();
        B.Create_Tiles_For_Game();
        // ...
    }

    /**
    * initializes some things for a new deal
    */ 
    public void Init_Board()
    {
          
    }
    
    /**
     * Define the button Draw Tiles
     */
    public void Set_DrawTiles(){
        
    }
    
    /**
     * Define the button End_Turn
     */
    public void Set_EndTurn(){
        
    }
    
    /**
     * Select which player will play on that turn
     * return the player that have to play 
     */
    public void Which_Player_Turn(){

    }
    
    /**
     * Is the first thing that a player does when is his turn (drag 4 tiles)
     */
    public void Player_Drag_Four_Tiles(){
        
    }
    
    /**
     * The player that plays at that turn can choose one of the character that he has available
     */
    public void Player_Selects_One_Character(){
    
    }
    
    /**
     * Player select tiles from the board at his turn
     */
    public void Player_Selects_Tiles_From_Board(){
    
    }
    
    /**
     * Set the points to player according to the tiles that he has
     */
    public void Set_points(){
    
    }
    
    /**
     * Check how many points a player has
     */
    public int Get_points(){
        return this.points;
    }
    
    /**
     * For the class view to appear the tiles that a player has
     */
    public void Get_Tiles_From_Player(){
        
    }
    
    /**
     * will check if there are landslides at door
     * @return true and end the game
     */
    public boolean End_Game(){
        return true;
    }
    
}