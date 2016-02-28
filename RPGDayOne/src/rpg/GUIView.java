package rpg;
import javax.swing.*;

/**
 * Created by Cinnamon on 2/28/16.
 */
public class GUIView implements GameView {
    public JFrame mainFrame;
    Controller parentController;

    public GUIView(Controller parent) {
        mainFrame = new JFrame("RPG");
        parentController = parent;
    }

    public void displayMainMenu() {
        MainMenu menu = new MainMenu(this.mainFrame, this);
    }
    public void displaySelectHero() {

    }
}
