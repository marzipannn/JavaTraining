package rpg.villains;
import rpg.Entity;
import rpg.heroes.*;
import rpg.artifacts.Weapon;

/**
 * Created by Cinnamon on 2/24/16.
 */
public abstract class Villain extends Entity {
    protected Weapon weapon;

    public Villain(String name) {
        super(name, 1);
    }

    public Villain(String name, int level) {
        super(name, level);
    }

    public Villain(String name, int level, int attackDamage, int healthPoints) {
        super(name, level, attackDamage, healthPoints);
    }

    public void addWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public int receiveDamage(int amount) {
        this.setHealthPoints(this.getHealthPoints() - amount);
        return (amount);
    }
    public int dealDamage() {
        int attackValue = this.getAttackDamage();
        int attackBonus;
        if (this.weapon != null)
            attackBonus = weapon.attackBonus;
        else
            attackBonus = 0;
        attackValue += attackBonus;
        return attackValue;
    }

    public int receiveDamageFrom(Hero attacker) {
        int dmg = attacker.getAttackValue();

        this.setHealthPoints(this.getHealthPoints() - dmg);
        return dmg;
    }

    public void attacks(String character) {
        int damage;
        damage = dealDamage();
        super.attacks(character, damage);
    }
}
