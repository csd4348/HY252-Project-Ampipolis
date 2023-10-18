package View;

import Model.Tile.*;
import javax.swing.*;
import java.awt.Image;
import Controller.Controller;
import Model.Player.Player;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author johnp
 */
public final class GraphicUI extends JFrame{
    
    public static Controller game;
    private JFrame frame;
    private Image image = Toolkit.getDefaultToolkit().getImage("src/images_2020/background.png");
    private JButton DrawTiles;
    private JButton EndTurn;
    private JLayeredPane BasicPanel;
    private JLayeredPane PlayerTiles;
    private JLayeredPane MosaicArea;
    private JLayeredPane LandSlideArea;
    private JLayeredPane StatueArea;
    private JLayeredPane SkeletonArea;
    private JLayeredPane AmphoraArea;
    private JLabel PlayerName;
    private JLabel UseCharacter;
    public JButton Archaeologist;
    public JButton Assistant;
    public JButton Digger;
    public JButton Professor;
    public JButton Play;
    private ArrayList <JButton> buttons = new ArrayList<JButton>();
    private JFrame win;
    private JLayeredPane P;
    private JLabel l;

    private static int selecttimetiles = 2;
    private static int count = 1;
    private static int count1 = 1;
   
    /**
     * Constructor for appearing the panel
     * @throws java.io.IOException
     */
    public GraphicUI() throws IOException {
        
        frame = new JFrame();
        BasicPanel = new ImagePanel();
        frame.add(BasicPanel);
        frame.setBounds(180, 0, 1003, 760);
        frame.setResizable(false);
        
        BasicPanel.setLayout(null);

        MosaicArea = new JLayeredPane();
        StatueArea = new JLayeredPane();
        AmphoraArea = new JLayeredPane();
        SkeletonArea = new JLayeredPane();
        LandSlideArea = new JLayeredPane();

        game = new Controller();
        Draw4Tiles();
        frame.setTitle("Amphipolis");
        frame.setVisible(true); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public void Draw4Tiles(){
        
        Tile tile;
        
        int size = Controller.B.TilesInBag.size();
        int k = getRandomNumber(0, size);;
        
        while(game.B.TilesInBag.get(k).Get_Category() != "AmphoraTile") k = getRandomNumber(0, size);
        if(game.B.TilesInBag.get(k).Get_Category() == "AmphoraTile"){
            JButton buttonTile = new JButton();
            buttonTile.addActionListener(new TilesAT5Areas(game.B.TilesInBag.get(k), buttonTile));
            image = game.B.TilesInBag.get(k).getImage();
            image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            buttonTile.setIcon(new ImageIcon(image));
            game.B.TilesInBag.remove(k);
            size = Controller.B.TilesInBag.size();
            AmphoraArea.add(buttonTile);
        }
        while("CaryatidTile" != game.B.TilesInBag.get(k).Get_Category()) k = getRandomNumber(0, size);
        if(game.B.TilesInBag.get(k).Get_Category() == "CaryatidTile"){
            JButton buttonTile = new JButton();
            buttonTile.addActionListener(new TilesAT5Areas(game.B.TilesInBag.get(k), buttonTile));
            image = game.B.TilesInBag.get(k).getImage();
            image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            buttonTile.setIcon(new ImageIcon(image));
            game.B.TilesInBag.remove(k);
            size = Controller.B.TilesInBag.size();
            StatueArea.add(buttonTile);
        }
        while("LandslideTile" != game.B.TilesInBag.get(k).Get_Category()) k = getRandomNumber(0, size);
        if(game.B.TilesInBag.get(k).Get_Category() == "LandslideTile"){
            JButton buttonTile = new JButton();
            buttonTile.addActionListener(new TilesAT5Areas(game.B.TilesInBag.get(k), buttonTile));
            image = game.B.TilesInBag.get(k).getImage();
            image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            buttonTile.setIcon(new ImageIcon(image));
            game.B.TilesInBag.remove(k);
            size = Controller.B.TilesInBag.size();
            LandSlideArea.add(buttonTile);
        }
        while("MosaicTile" != game.B.TilesInBag.get(k).Get_Category()) k = getRandomNumber(0, size);
        if(game.B.TilesInBag.get(k).Get_Category() == "MosaicTile"){
            JButton buttonTile = new JButton();
            buttonTile.addActionListener(new TilesAT5Areas(game.B.TilesInBag.get(k), buttonTile));
            image = game.B.TilesInBag.get(k).getImage();
            image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            buttonTile.setIcon(new ImageIcon(image));
            game.B.TilesInBag.remove(k);
            size = Controller.B.TilesInBag.size();
            MosaicArea.add(buttonTile);
        }
        while("SkeletonTile" != game.B.TilesInBag.get(k).Get_Category()) k = getRandomNumber(0, size);
        if(game.B.TilesInBag.get(k).Get_Category() == "SkeletonTile"){
            JButton buttonTile = new JButton();
            buttonTile.addActionListener(new TilesAT5Areas(game.B.TilesInBag.get(k), buttonTile));
            image = game.B.TilesInBag.get(k).getImage();
            image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
            buttonTile.setIcon(new ImageIcon(image));
            game.B.TilesInBag.remove(k);
            size = Controller.B.TilesInBag.size();
            SkeletonArea.add(buttonTile);
        }
//
//        
//                    if("AmphoraTile".equals(tile.Get_Category()))AmphoraArea.add(buttonTile);
//                    if("CaryatidTile".equals(tile.Get_Category()))StatueArea.add(buttonTile);
//                    if("LandslideTile".equals(tile.Get_Category()))LandSlideArea.add(buttonTile);
//                    if("MosaicTile".equals(tile.Get_Category()))MosaicArea.add(buttonTile);
//                    if("SkeletonTile".equals(tile.Get_Category()))SkeletonArea.add(buttonTile);
//                    if("SphinxTile".equals(tile.Get_Category()))StatueArea.add(buttonTile);
    }
    
    /**
     * Create the buttons for the 4 characters
     */
    public void CreateCharacterButtons(){
        
        Insets insets;
        Dimension size;

        if(game.PlayerTurn.Characters_per_Player.get(0).HasBeenUsed() != true)
        {    
            Archaeologist = new JButton();
            Archaeologist.addActionListener(new CharacterCards(Toolkit.getDefaultToolkit().getImage("src/images_2020/archaeologist.png")));

            insets = BasicPanel.getInsets();
            size = Archaeologist.getPreferredSize();
            Archaeologist.setBounds(798 + insets.left, 130 + insets.top,
                         size.width + 50, size.height + 150);
            image = Toolkit.getDefaultToolkit().getImage("src/images_2020/archaeologist.png");
            image = image.getScaledInstance(90, 160, java.awt.Image.SCALE_SMOOTH);
            Archaeologist.setIcon(new ImageIcon(image));
            BasicPanel.add(Archaeologist);
        }
        
        if(game.PlayerTurn.Characters_per_Player.get(1).HasBeenUsed() != true)
        {
            Assistant = new JButton();
            Assistant.addActionListener(new CharacterCards(Toolkit.getDefaultToolkit().getImage("src/images_2020/assistant.png")));
            insets = BasicPanel.getInsets();
            size = Assistant.getPreferredSize();
            Assistant.setBounds(900 + insets.left, 130 + insets.top,
                         size.width + 50, size.height + 150);
            image = Toolkit.getDefaultToolkit().getImage("src/images_2020/assistant.png");
            image = image.getScaledInstance(90, 160, java.awt.Image.SCALE_SMOOTH);
            Assistant.setIcon(new ImageIcon(image));
            BasicPanel.add(Assistant);
        }

        if(game.PlayerTurn.Characters_per_Player.get(2).HasBeenUsed() != true)
        {
            Digger = new JButton();
            Digger.addActionListener(new CharacterCards(Toolkit.getDefaultToolkit().getImage("src/images_2020/digger.png")));
            insets = BasicPanel.getInsets();
            size = Digger.getPreferredSize();
            Digger.setBounds(798 + insets.left, 310 + insets.top,
                         size.width + 50, size.height + 150);
            image = Toolkit.getDefaultToolkit().getImage("src/images_2020/digger.png");
            image = image.getScaledInstance(90, 160, java.awt.Image.SCALE_SMOOTH);
            Digger.setIcon(new ImageIcon(image));
            BasicPanel.add(Digger);
        }
        
        if(game.PlayerTurn.Characters_per_Player.get(3).HasBeenUsed() != true)
        {
            Professor = new JButton();
            Professor.addActionListener(new CharacterCards(Toolkit.getDefaultToolkit().getImage("src/images_2020/professor.png")));
            insets = BasicPanel.getInsets();
            size = Professor.getPreferredSize();
            Professor.setBounds(900 + insets.left, 310 + insets.top,
                         size.width + 50, size.height + 150);
            image = Toolkit.getDefaultToolkit().getImage("src/images_2020/professor.png");
            image = image.getScaledInstance(90, 160, java.awt.Image.SCALE_SMOOTH);
            Professor.setIcon(new ImageIcon(image));
            BasicPanel.add(Professor);
        }
    }
        
//    public static void main(String[] args) throws IOException{
//       Controller.view = new GraphicUI();
//       Controller.view.CreateCharacterButtons();
//       Controller.view.InitComponents();
//    }

    /**
     * Is my Desktop pane that adds the background image to the frame
     */
    class ImagePanel extends JLayeredPane {
        Image img;
        public ImagePanel(){
            img = Toolkit.getDefaultToolkit().getImage("src/images_2020/background.png");
        }
        public void paintComponent(Graphics g) 
        {        
            g.drawImage(img, 0, 0, this.getWidth()-210, this.getHeight()-70, this);
        }
    }
    
    /**
     * initializes buttons, panes and labels
     */
    public void InitComponents() {
        BasicPanel.add(MosaicArea);
        BasicPanel.add(StatueArea);
        BasicPanel.add(AmphoraArea);
        BasicPanel.add(SkeletonArea);
        BasicPanel.add(LandSlideArea);

        Insets insets = BasicPanel.getInsets();
        Dimension size = MosaicArea.getPreferredSize();
        MosaicArea.setBounds(35 + insets.left - 5,20 + insets.top,
                     size.width + 277 - 65, size.height + 190);
        size = StatueArea.getPreferredSize();
        StatueArea.setBounds(545 + insets.left - 5, 20 + insets.top,
                     size.width + 277 - 65, size.height + 190);
        size = AmphoraArea.getPreferredSize();
        AmphoraArea.setBounds(32 + insets.left, 466 + insets.top,
                     size.width + 277 - 65, size.height + 190);
        size = SkeletonArea.getPreferredSize();
        SkeletonArea.setBounds(543 + insets.left, 466 + insets.top,
                     size.width + 277 - 65, size.height + 190);
        size = LandSlideArea.getPreferredSize();
        LandSlideArea.setBounds(290 + insets.left - 5, 287 + insets.top,
                     size.width + 277 - 65, size.height + 195);
        
        PlayerName = new JLabel("Player P1");
        
        UseCharacter = new JLabel("Use Character");
        insets = BasicPanel.getInsets();
        size = PlayerName.getPreferredSize();
        PlayerName.setBounds(868 + insets.left,  insets.top,
                     size.width + 135, size.height + 70);
        size = UseCharacter.getPreferredSize();
        UseCharacter.setBounds(852 + insets.left, 50 + insets.top,
                     size.width + 135, size.height + 70);
        BasicPanel.add(PlayerName);
        BasicPanel.add(UseCharacter);
        
        // adding buttons panel
        DrawTiles = new JButton("DrawTiles");
        DrawTiles.addActionListener(new DrawTiles());   //  actionlistener at drawtiles
        EndTurn = new JButton("EndTurn");
        EndTurn.addActionListener(new EndTurn());       //  actionlistener at endturn
        insets = BasicPanel.getInsets();
        size = DrawTiles.getPreferredSize();
        DrawTiles.setBounds(792 + insets.left, 515 + insets.top,
                     size.width + 108, size.height + 40);
        size = EndTurn.getPreferredSize();
        EndTurn.setBounds(792 + insets.left, 592 + insets.top,
                     size.width + 118, size.height + 40);
        BasicPanel.add(DrawTiles);
        BasicPanel.add(EndTurn);
         
        Play = new JButton("PLAY");
        Play.addActionListener(new Play());
        size = Play.getPreferredSize();
        Play.setBounds(303 + insets.left, 100 + insets.top,
                     size.width + 118, size.height + 40);
        BasicPanel.add(Play);
        //CreateCharacterButtons();

        // adding player tiles panel
        PlayerTiles = new JLayeredPane();
        insets = BasicPanel.getInsets();
        size = PlayerTiles.getPreferredSize();
        PlayerTiles.setBounds(insets.left, 660 + insets.top,
                     size.width + 962, size.height + 65);
        BasicPanel.add(PlayerTiles);
        
        PlayerTiles.setLayout(new GridLayout(1, 4));
        MosaicArea.setLayout(new GridLayout(4, 4));
        StatueArea.setLayout(new GridLayout(4, 4));
        AmphoraArea.setLayout(new GridLayout(4, 4));
        SkeletonArea.setLayout(new GridLayout(4, 4));
        LandSlideArea.setLayout(new GridLayout(4, 4));
    }
    

    private class CharacterCards implements ActionListener{
        
        Image image;
        /**
         * Constructor
         * @param im 
         */
        public CharacterCards (Image im){
            this.image = im;
        }
        
        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            if(count1 == 1)
            {    
                if(e.getSource() == Archaeologist)
                {
                    game.PlayerTurn.Characters_per_Player.get(0).Use();
                    selecttimetiles += 2;
                    BasicPanel.remove(Archaeologist);
                    BasicPanel.revalidate();
                    BasicPanel.repaint();
                }
                else if(e.getSource() == Assistant)
                {
                    game.PlayerTurn.Characters_per_Player.get(1).Use();
                    selecttimetiles += 1;
                    BasicPanel.remove(Assistant);
                    BasicPanel.revalidate();
                    BasicPanel.repaint();
                }
                else if(e.getSource() == Digger)
                {
                    game.PlayerTurn.Characters_per_Player.get(2).Use();
                    selecttimetiles += 2;
                    BasicPanel.remove(Digger);
                    BasicPanel.revalidate();
                    BasicPanel.repaint();
                }
                else if(e.getSource() == Professor)
                {
                    game.PlayerTurn.Characters_per_Player.get(3).Use();
                    selecttimetiles += 3;
                    BasicPanel.remove(Professor);
                    BasicPanel.revalidate();
                    BasicPanel.repaint();
                }
                count1--;
            }
        }        
    }
   

    private class TilesAT5Areas implements ActionListener{
        
        Tile tile;
        JButton button;

        /**
         * Constructor
         * @param T
         * @param B 
         */
        public TilesAT5Areas(Tile T, JButton B){
            this.tile = T;   
            this.button = B;
        }
        
        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(selecttimetiles > 0)
            {
                selecttimetiles--;
                if("LandslideTile".equals(tile.Get_Category()))
                {  
                }
                else if("MosaicTile".equals(tile.Get_Category()))
                {
                    game.PlayerTurn.AddTileToPlayer(tile);
                    for (ActionListener al : button.getActionListeners()) {
                        button.removeActionListener(al);
                    }
                    MosaicArea.remove(button);
                    buttons.add(button);
                    MosaicArea.revalidate();
                    MosaicArea.repaint();
                }
                else if("AmphoraTile".equals(tile.Get_Category()))
                {
                    game.PlayerTurn.AddTileToPlayer(tile);
                    for (ActionListener al : button.getActionListeners()) {
                        button.removeActionListener(al);
                    }
                    AmphoraArea.remove(button);
                    buttons.add(button);
                    AmphoraArea.revalidate();
                    AmphoraArea.repaint();
                }
                else if("CaryatidTile".equals(tile.Get_Category()))
                {
                    game.PlayerTurn.AddTileToPlayer(tile);
                    for (ActionListener al : button.getActionListeners()) {
                        button.removeActionListener(al);
                    }
                    StatueArea.remove(button);
                    buttons.add(button);
                    StatueArea.revalidate();
                    StatueArea.repaint();
                }
                else if("SkeletonTile".equals(tile.Get_Category()))
                {
                    game.PlayerTurn.AddTileToPlayer(tile);
                    for (ActionListener al : button.getActionListeners()) {
                        button.removeActionListener(al);
                    }
                    SkeletonArea.remove(button);
                    buttons.add(button);
                    SkeletonArea.revalidate();
                    SkeletonArea.repaint();
                }
                else if("SphinxTile".equals(tile.Get_Category()))
                {
                    game.PlayerTurn.AddTileToPlayer(tile);
                    for (ActionListener al : button.getActionListeners()) {
                        button.removeActionListener(al);
                    }
                    StatueArea.remove(button);
                    buttons.add(button);
                    StatueArea.revalidate();
                    StatueArea.repaint();
                }
            }
        }
    }
    
    public class Fr extends JFrame {
        
        /**
         * Constructor that create the frame at the end of the game (reveal the winner)
         */
        public Fr()
        {
            frame.dispose();
            
            win = new JFrame();
            win.setBounds(480, 200, 500, 300);
            win.setResizable(false);
            
            P = new JLayeredPane();
            P.setLayout(new BorderLayout());
            win.add(P);
            JButton b = new JButton("EXIT");
            P.add(b, BorderLayout.SOUTH);
            b.addActionListener(new Exit());
            JButton W = new JButton("SHOW WINNER");
            P.add(W, BorderLayout.CENTER);
            W.addActionListener(new ShowWinner());
            win.setVisible(true);
            
            Insets insets = win.getInsets();
            Dimension size = P.getPreferredSize();
            P.setBounds(insets.left, insets.top,
                     size.width + 400, size.height + 300);

            l = new JLabel("");
            P.add(l, BorderLayout.NORTH);
            win.setTitle("The Winner is : " );
        }
    }

    
    // used for doing some action after DrawTiles button has been pushed
    private class DrawTiles implements ActionListener{
        
        Tile tile;

        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(count == 1)
            {
                int size = Controller.B.TilesInBag.size();
                int k;
                for(int i = 0; i < 4; i++)
                {
                    k = getRandomNumber(0, size);
                    tile = Controller.B.TilesInBag.remove(k);
                    size = Controller.B.TilesInBag.size();

                    JButton buttonTile = new JButton();
                    buttonTile.addActionListener(new TilesAT5Areas(tile, buttonTile));
                    image = tile.getImage();
                    image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                    if("AmphoraTile".equals(tile.Get_Category()))AmphoraArea.add(buttonTile);
                    if("CaryatidTile".equals(tile.Get_Category()))StatueArea.add(buttonTile);
                    if("LandslideTile".equals(tile.Get_Category()))LandSlideArea.add(buttonTile);
                    if("MosaicTile".equals(tile.Get_Category()))MosaicArea.add(buttonTile);
                    if("SkeletonTile".equals(tile.Get_Category()))SkeletonArea.add(buttonTile);
                    if("SphinxTile".equals(tile.Get_Category()))StatueArea.add(buttonTile);
                    buttonTile.setIcon(new ImageIcon(image));
                }   
                if(LandSlideArea.getComponentCount() >= 16)
                {
                    Fr p = new Fr();
                }
            System.out.println(Controller.B.TilesInBag.size());
            count--;
            }
        }
    }
    
    // used for doing some action after EndTurn button has been pushed
    private class EndTurn implements ActionListener{
        
        /**
         * remove all buttons at playerTiles JLayeredPane
         */
        private void Clear(){
            for(int i = buttons.size()-1; i >= 0; i--){
                PlayerTiles.remove(buttons.get(i));
            }
            buttons.clear();
            PlayerTiles.removeAll();
            PlayerTiles.revalidate();
            PlayerTiles.repaint();
        }

        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {          
            Player P;
            P = game.Which_Player_Turn();
            game.Set_Player_Turn(P);
            PlayerName.setText("Player " + game.PlayerTurn.getName());
            Clear();
            for(int i = game.PlayerTurn.GetTilesFromPlayer().size()-1; i >= 0; i--){
                JButton J = new JButton();
                image = game.PlayerTurn.GetTilesFromPlayer().get(i).getImage();
                image = image.getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH);
                J.setIcon(new ImageIcon(image));
                PlayerTiles.add(J);
            }
            BasicPanel.remove(Archaeologist);
            BasicPanel.remove(Assistant);
            BasicPanel.remove(Digger);
            BasicPanel.remove(Professor);
            BasicPanel.revalidate();
            BasicPanel.repaint();
            game.view.CreateCharacterButtons();
            selecttimetiles = 2;
            count = 1;
            count1 = 1;
        }
    }
    
    private class ShowWinner implements ActionListener{

        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            game.Set_points(game.P1);
            game.Set_points(game.P2);
            game.Set_points(game.P3);
            game.Set_points(game.P4);
            game.Set_Winner();
            //game.Winner.setName(game.nn);
            l.setText("The winner is : " + game.Winner.getName() + " ,with points = " + game.Winner.GetPoints());
        }
    }
    
    private class Play implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            BasicPanel.remove(Play);
            BasicPanel.revalidate();
            BasicPanel.repaint();
        }
        
    }

    private class Exit implements ActionListener{

        /**
         * Function that called when a button has ActionListener to this class
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            win.dispose();
            System.exit(0);
        }
    }
}