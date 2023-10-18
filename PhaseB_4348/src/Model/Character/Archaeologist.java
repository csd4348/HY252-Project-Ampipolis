package Model.Character;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class Archaeologist extends Character{

    private String Charact = "Archaeologist";
    private String Colour;
    private boolean Use = false;
    
    @Override
    public void Use() {
        this.Use = true;
    }
    
    /**
     * 
     * @return true if this character had been used
     */
    @Override
    public boolean HasBeenUsed() {
        return this.Use;
    }

    /**
     * Set the colour for this card character 
     */
    @Override
    public void SetColour(String colour) {
        this.Colour = colour;
    }

    /**
     * Get the category from character
     * @return 
     */
    @Override
    public String Category() {
        return this.Charact;
    }
}
