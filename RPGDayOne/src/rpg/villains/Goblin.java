package rpg.villains;

/**
 * Created by Cinnamon on 2/24/16.
 */
public class Goblin extends Villain {
    public Goblin(String name) {
        super(name, 1, 70, 70);
    }
    public String toString() {
        String s = "Goblin " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getEffectiveAttackDamage() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void attacks() {
        super.attacks("Goblin " + this.getName());
    }
}
