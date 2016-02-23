package rpg;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Entity {
    protected String name;
    protected int healthPoints;
    protected int attackDamage;
    protected int level;
    protected int experiencePoints;

    public Entity(String name) {
        this(name, 1);
    }

    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
        this.healthPoints = 100 * this.level;
        this.attackDamage = 10 * this.level;
    }

    public int receiveDamage(int amount) {
        this.healthPoints -= amount;
        return amount;
    }

    public int dealDamage(int attackValue) {
        return attackValue;
    }
}
