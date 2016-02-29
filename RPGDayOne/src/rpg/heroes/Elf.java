package rpg.heroes;

import java.io.Serializable;

/**
 * Created by Cinnamon on 2/24/16.
 */
public class Elf extends Hero implements Serializable {
    public Elf(String name) {
        super(name, 1, 100, 50);
    }
    public Elf(String name, int level) {
        super(name, level, 100, 50);
    }
    public String toString() {
        String s = "Elf " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getAttackValue() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void attacks() {
        super.attacks("Elf " + this.getName());
    }

    public String getType() {
        return "Elf";
    }
}
