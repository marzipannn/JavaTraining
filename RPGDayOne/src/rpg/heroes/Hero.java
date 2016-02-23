package rpg.heroes;
import rpg.Entity;
import rpg.artifacts.*;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Hero extends Entity {
    protected Weapon weapon;
    protected Armor armor;

    public Hero(String name) {
        super(name, 1);
    }

    public Hero(String name, int level) {
        super(name, level);
    }

    public String toString() {
        String s = "-- Hero created --" + "\n" +
                "name: " + this.name + "\n" +
                "level: " + this.level + "\n" +
                "------";
        return s;
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void addArmor(Armor armor) {
        this.armor = armor;
    }

    public int receiveDamage(int amount) {
        int defense;
        if (this.armor != null)
            defense = armor.defenseBonus;
        else
            defense = 0;
        amount -= defense;
        this.healthPoints -= amount;
        return amount;
    }
    public int dealDamage(int attackValue) {
        int attackBonus;
        if (this.weapon != null)
            attackBonus = weapon.attackBonus;
        else
            attackBonus = 0;
        attackValue += attackBonus;
        return attackValue;
    }
}
