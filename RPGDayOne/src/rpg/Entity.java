package rpg;

import java.io.Serializable;

/**
 * Created by Cinnamon on 2/23/16.
 */
public abstract class Entity implements Identifiable, Serializable {
    private String name;
    private String type;
    private int healthPoints;
    private int attackDamage;
    private int level;
    private int experiencePoints;
    private int id;
    private static int iterator = 0;

    /* constructors */
    public Entity(String name) {
        this(name, 1);
    }
    public Entity(String name, int level) {
        this.name = name;
        this.level = level;
        this.healthPoints = 100;
        this.attackDamage = 10;
        this.id = generateUniqueId();
    }
    public Entity(String name, int level, int attackDamage, int healthPoints) {
        this.name = name;
        this.level = level;
        this.attackDamage = attackDamage + (level * 10);
        this.healthPoints = healthPoints + (level * 10);
        this.id = generateUniqueId();
    }

    public abstract String getType();

    /* id related methods */
    public int getId() {
        return id;
    }
    private int generateUniqueId() {
        return iterator++;
    }
    public boolean equals(Object object) {
        Entity entity = (Entity)object;
        if (this.getId() == entity.getId())
            return true;
        else
            return false;
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
    public void setLevel(int level) {
        this.level = level;
    }

    public void attacks(String character, int damage) {
        String s = character + " attacks, dealing " + damage + " damage!";
        System.out.println(s);
    }
}
