package Model.Character;
import View.GraphicUI;

/**
 *
 * @author johnp
 */
public abstract class Character {
    public abstract void Use();
    public abstract boolean HasBeenUsed();
    public abstract String Category();
    public abstract void SetColour(String colour);
}
