package Model.Character;

import View.GraphicUI;
/**
 *
 * @author johnp
 */
public class Assistant extends Character{

    /**
     * 
     * @return true if this character had been used
     */
    @Override
    public boolean HasBeenUsed() {
        return true;
    }

    /**
     * Contains the functionality of this character
     */
    @Override
    public void Functionality() {
    }

    /**
     * Set the colour for this card character 
     */
    @Override
    public void Colour() {
    }

    /**
     * 
     * @return how many tiles the character can get. 
     */
    @Override
    public int How_Many_Tiles_He_Gets() {
        return 1;
    }
    
}