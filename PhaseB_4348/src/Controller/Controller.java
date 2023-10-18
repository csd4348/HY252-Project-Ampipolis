package Controller;

import Model.Player.Player;
import Model.Bag.Bag;
import Model.Tile.Tile;
import View.GraphicUI;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author johnp
 */
public class Controller {
    
    public Player P1,P3,P2,P4;
    public Player PlayerTurn;
    private ArrayList <Player> players = new ArrayList<Player>();
    public static Bag B;
    public Player Winner;
    public static GraphicUI view;
    private static int points;
    
    public ArrayList<Tile> Amphora;
    public ArrayList<Tile> Caryatid;
    public ArrayList<Tile> Mosaic;
    public ArrayList<Tile> Skeleton;
    public ArrayList<Tile> Sphinx;
    public String nn;

            
    /**
     * The constructor of controller class that define the game 
     */
    public Controller(){
        Winner = new Player("P1");
        P1 = new Player("P1");
        for(int i = 0; i < 4; i++) P1.Characters_per_Player.get(i).SetColour("YELLOW");
        PlayerTurn = P1;
        P2 = new Player("P2");
        for(int i = 0; i < 4; i++) P2.Characters_per_Player.get(i).SetColour("RED");
        P3 = new Player("P3");
        for(int i = 0; i < 4; i++) P3.Characters_per_Player.get(i).SetColour("BLUE");
        P4 = new Player("P4");
        for(int i = 0; i < 4; i++) P4.Characters_per_Player.get(i).SetColour("BLACK");
        players.add(P1);
        players.add(P2);
        players.add(P3);
        players.add(P4);
        B = new Bag();
        B.Create_Tiles_For_Game();
        Amphora = new ArrayList<Tile>();
        Caryatid = new ArrayList<Tile>();
        Mosaic = new ArrayList<Tile>();
        Skeleton = new ArrayList<Tile>();
        Sphinx = new ArrayList<Tile>();  
    }
    
    /**
     * Choose which player will play next
     * @param p
     * @param p1
     * @param p2
     * @param p3
     * @param p4
     * @return 
     */
    public Player Control_Player_Turn(Player p, Player p1, Player p2, Player p3, Player p4){
        Player player = p1;
        if(p == p1) return p2;
        if(p == p2) return p3;
        if(p == p3) return p4;
        if(p == p4) return p1;
        return player;
    }
    
    /**
     * Select which player will play on that turn
     * return the player that have to play 
     * @return 
     */
    public Player Which_Player_Turn(){
        return Control_Player_Turn(PlayerTurn, P1, P2, P3, P4);
    }
    
    /**
     * Set the player that have to play on this turn
     * @param p 
     */
    public void Set_Player_Turn(Player p){
        PlayerTurn = p;
    }
    
    
//    public int Count_Points_From_Amphora_Tiles(){
//        
//        return points;
//    }
//    
//    public int Count_Points_From_Caryatid_Tiles(){
//        
//        return points;
//    }
    
    /**
     * Count the points that a player has win from the mosaic tiles
     * @return 
     */
    public int Count_Points_From_Mosaic_Tiles(){
        int greenM = 0;
        int yellowM = 0;
        int redM = 0;
        int point = 0;
        
        for(int i = Mosaic.size() - 1; i >= 0; i--)
        {
            if(Mosaic.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_green.png")) greenM++;
            else if(Mosaic.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_yellow.png")) yellowM++;
            else if(Mosaic.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/mosaic_red.png"))redM++;
        }
        
        while(greenM >= 4){
            greenM = greenM - 4;
            point += 4;
        }
        while(yellowM >= 4){
            yellowM = yellowM - 4;
            point += 4;
        }
        while(redM >= 4){
            redM = redM - 4;
            point += 4;
        }
        
        point += ((greenM + yellowM + redM)/4) * 2 ;

        return point;
    }
    
    public int Count_Points_From_Skeleton_Tiles(){
        int BigUp = 0;
        int BigDown = 0;
        int SmallUp = 0;
        int SmallDown = 0;
        int BigSkeletons = 0;
        int SmallSkeletons = 0;
        int Families = 0;
        int point = 0;
        
        for(int i = Skeleton.size() - 1; i >= 0; i--)
        {
            if(Skeleton.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_big_top.png")) BigUp++;
            else if(Skeleton.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_big_bottom.png")) BigDown++;
            else if(Skeleton.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_small_top.png"))SmallUp++;
            else if(Skeleton.get(i).getImage() == Toolkit.getDefaultToolkit().getImage("src/images_2020/skeleton_small_bottom.png"))SmallDown++;
        }
        
        BigSkeletons = Integer.min(BigUp, BigDown);
        SmallSkeletons = Integer.min(SmallUp, SmallDown);
        Families = Integer.min(BigSkeletons/2, SmallSkeletons);
        point += (6 * Families);
        
        point += (BigSkeletons - 2*Families) + (SmallSkeletons - Families);
        
        return point;
    }
//    public int Count_Points_From_Sphinx_Tiles(){
//        
//        return points;
//    }
    
    /**
     * Check how many points a player has
     * @param P
     * @return 
     */
    public int Get_points(Player P){
        return P.GetPoints();
    }
    
    /**
     * Distribute all the tiles that a player had gather, to the array lists 
     * @param P 
     */
    public void Distribute_Tiles(Player P){
        
        for(int i = P.GetTilesFromPlayer().size() - 1; i >= 0; i--)
        {
            if("AmphoraTile".equals(P.GetTilesFromPlayer().get(i).Get_Category())) Amphora.add(P.GetTilesFromPlayer().get(i));
            else if("CaryatidTile".equals(P.GetTilesFromPlayer().get(i).Get_Category())) Caryatid.add(P.GetTilesFromPlayer().get(i));
            else if("MosaicTile".equals(P.GetTilesFromPlayer().get(i).Get_Category()))  Mosaic.add(P.GetTilesFromPlayer().get(i));
            else if("SkeletonTile".equals(P.GetTilesFromPlayer().get(i).Get_Category())) Skeleton.add(P.GetTilesFromPlayer().get(i));
            else if("SphinxTile".equals(P.GetTilesFromPlayer().get(i).Get_Category())) Sphinx.add(P.GetTilesFromPlayer().get(i));
        } 
    }
    
    /**
     * Set the points to player according to the tiles that he has
     * @param P
     */
    public void Set_points(Player P){

        Distribute_Tiles(P);
        //points += Count_Points_From_Amphora_Tiles();
        //points += Count_Points_From_Caryatid_Tiles();
        points += Count_Points_From_Mosaic_Tiles();
        points += Count_Points_From_Skeleton_Tiles();
        //points += Count_Points_From_Sphinx_Tiles();
        
        if(P == P1) P1.SetPoints(points);
        else if(P == P2) P2.SetPoints(points);
        else if(P == P3) P3.SetPoints(points);
        else if(P == P4) P4.SetPoints(points);

        System.out.println(points + " points to player = " + P.getName());
        points = 0;
        Amphora.clear();
        Caryatid.clear();
        Mosaic.clear();
        Skeleton.clear();
        Sphinx.clear();
    }
    
    /**
     * For the class view to appear the tiles that a player has
     * @param P
     * @return 
     */
    public ArrayList<Tile> Get_Tiles_From_Player(Player P){
        return P.GetTilesFromPlayer();
    }
    
    /**
     * Set the winner of the game
     */
    public void Set_Winner(){
        int max = -1;
        if(max < P1.GetPoints()) max = P1.GetPoints();
        if(max < P2.GetPoints()) max = P2.GetPoints();
        if(max < P3.GetPoints()) max = P3.GetPoints();
        if(max < P4.GetPoints()) max = P4.GetPoints();
        
        if(max == P1.GetPoints()) Winner = P1;
        if(max == P2.GetPoints()) Winner = P2;
        if(max == P3.GetPoints()) Winner = P3;
        if(max == P4.GetPoints()) Winner = P4; 
    }
    
    /**
     * Return the winner of the game
     * @return 
     */
    public Player Get_Winner(){
        return this.Winner;
    }
    
    public static void main(String[] args) throws IOException {
        
        view = new GraphicUI();
        view.CreateCharacterButtons();
        view.InitComponents();
    }
}