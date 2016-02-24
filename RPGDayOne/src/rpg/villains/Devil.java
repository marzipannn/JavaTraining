package rpg.villains;

/**
 * Created by Cinnamon on 2/24/16.
 */
public class Devil extends Villain {
    public Devil(String name) {
        super(name, 1, 70, 50);
    }
    public String toString() {
        String s = "Devil " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getEffectiveAttackDamage() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void attacks() {
        super.attacks("Devil " + this.getName());
    }
}