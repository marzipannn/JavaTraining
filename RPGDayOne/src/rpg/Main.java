package rpg;
import rpg.heroes.*;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Main {
    public static void main(String[] args) {
        Mage a = new Mage("a", 5);
        Mage b = new Mage("b", 2);

        Hero[] heroes = {a, b};
        for (Hero h: heroes) {
            System.out.println(h.name);
        }
    }
}