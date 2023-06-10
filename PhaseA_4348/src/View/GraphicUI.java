package View;

import javax.swing.*;
import java.awt.Image;
import Controller.Controller;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class GraphicUI {
    private Image image;
    private JButton DrawTiles;
    private JButton EndTurn;
    private JButton Exit;
    private myDesktopPane BasicPanel;
    private JLayeredPane table;
    private JLayeredPane MosaicArea;
    private JLayeredPane LandSlideArea;
    private JLayeredPane SatueArea;
    private JLayeredPane SkeletonArea;
    private JLayeredPane AmphoraArea;
    private JLabel PlayerName;
    private JLabel UseCharacter;
    private JButton buttonBrowse = new JButton();
    
//buttonBrowse = new JButton();
//buttonBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/icons/browse.png")));
//buttonBrowse.setBorderPainted(false);
//buttonBrowse.setFocusPainted(false);
//buttonBrowse.setContentAreaFilled(false);
    
    /**
     * Constructor for appearing the panel
     */
    public GraphicUI(){
        
    }
    
    public class myDesktopPane extends JDesktopPane
    {
        private Image backImage = null;
 
        @Override
        public void paintComponent(Graphics G) {
		super.paintComponent(G);
		G.drawImage(image, 0, 0, this);
	}
    }
    
    public void CreateButtons(){
      
    }
    
    /**
     * initializes buttons, panes and labels
     */
    private void InitComponents() {
      
    }
    
    // used for doing some action after DrawTiles button has been pushed
    private class DrawTiles implements ActionListener{
    
    }
    
    
    // used for doing some action after EndTurn button has been pushed
    private class EndTurn implements ActionListener{
        
    }
    
// used for doing some action after Exit button has been pushed
    private class Exit implements ActionListener{
    
    }
}
