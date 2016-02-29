package rpg.heroes;
import rpg.Entity;
import rpg.villains.*;
import rpg.artifacts.*;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Cinnamon on 2/23/16.
 */

class NotEnoughSpaceException extends Exception {
    public NotEnoughSpaceException(String message) {
        super(message);
    }
}
public abstract class Hero extends Entity implements Serializable {
    protected Weapon weapon;
    protected Armor armor;
    protected ArrayList<Artifact> inventory;
    protected int inventoryMax;

    public Hero(String name) {
        this(name, 1, 100, 100);
    }

    public Hero(String name, int level) {
        this(name, level, 100, 100);
    }

    public Hero(String name, int level, int attackDamage, int healthPoints) {
        super(name, level, attackDamage, healthPoints);
        inventory = new ArrayList<Artifact>(level * 2);
        inventoryMax = level * 2;
    }

    public String toString() {
        String s = "Hero " + this.getName() + " (level " + this.getLevel() +
                "), attack: " + this.getAttackValue() +
                ", health: " + this.getHealthPoints();
        return s;
    }

    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    public int receiveDamage(int amount) {
        int defense;
        if (this.armor != null)
            defense = armor.defenseBonus;
        else
            defense = 0;
        amount -= defense;
        this.setHealthPoints(this.getHealthPoints() - amount);
        return amount;
    }
    public int getAttackValue() {
        int attackValue = this.getAttackDamage();
        int attackBonus;
        if (this.weapon != null)
            attackBonus = weapon.attackBonus;
        else
            attackBonus = 0;
        attackValue += attackBonus;
        return attackValue;
    }

    public int dealDamageTo(Villain opponent) {
        int dmg = opponent.receiveDamageFrom(this);
        return dmg;
    }

    public void attacks(String character) {
        int damage;
        damage = getAttackValue();
        super.attacks(character, damage);
    }

    public void addToInventory(Artifact artifact) throws NotEnoughSpaceException {
        if (inventory.size() <= inventoryMax) {
            inventory.add(artifact);
        }
        else
            throw new NotEnoughSpaceException("Your inventory is full!");
    }
}
