package rpg;
import rpg.heroes.*;
import rpg.villains.*;
import rpg.artifacts.*;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Main {

    public static void fight(Entity attacker, Entity target) {

    }

    public static void main(String[] args) {
        Mage mage = new Mage("A");
        Elf elf = new Elf("B");
        Devil devil = new Devil("X");
        Goblin goblin = new Goblin("Z");

        System.out.println(devil);
        mage.attacks();
        devil.receiveDamage(mage.getEffectiveAttackDamage());
        System.out.println(devil);
    }
}