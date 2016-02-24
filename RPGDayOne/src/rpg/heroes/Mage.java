package rpg.heroes;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Mage extends Hero {
    public Mage(String name) {
        super(name, 1, 100, 50);
    }
    public Mage(String name, int level) {
        super(name, level, 100, 50);
    }
    public String toString() {
        String s = "Mage " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getEffectiveAttackDamage() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void attacks() {
        super.attacks("Mage " + this.getName());
    }

    public String getType() {
        return "Mage";
    }
}
