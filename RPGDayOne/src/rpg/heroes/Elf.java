package rpg.heroes;

/**
 * Created by Cinnamon on 2/24/16.
 */
public class Elf extends Hero {
    public Elf(String name) {
        super(name, 1, 100, 50);
    }
    public Elf(String name, int level) {
        super(name, level, 100, 50);
    }
    public String toString() {
        String s = "Elf " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getEffectiveAttackDamage() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void attacks() {
        super.attacks("Goblin " + this.getName());
    }
}
