package rpg;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Entity {
    private String name;
    private int healthPoints;
    private int attackDamage;
    private int level;
    private int experiencePoints;

    public Entity(String name) {
        this(name, 1);
    }

    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
        this.healthPoints = 100;
        this.attackDamage = 10;
    }
    public Entity(String name, int level, int attackDamage, int healthPoints) {
        this.name = name;
        this.level = level;
        this.attackDamage = attackDamage + (level * 10);
        this.healthPoints = healthPoints + (level * 10);
    }

    public int receiveDamage(int amount) {
        this.healthPoints -= amount;
        return amount;
    }

    public int getEffectiveAttackDamage() {
        return this.attackDamage;
    }

    public String getName() {
        return this.name;
    }
    public int getLevel() {
        return level;
    }
    public int getHealthPoints() {
        return this.healthPoints;
    }
    public int getAttackDamage() {
        return this.attackDamage;
    }
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void attacks(String character, int damage) {
        String s = character + " attacks, dealing " + damage + " damage!";
        System.out.println(s);
    }
}
