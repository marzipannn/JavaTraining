package rpg;
import rpg.heroes.*;
import rpg.villains.*;
import rpg.artifacts.*;

import java.io.IOException;

/**
 * Created by Cinnamon on 2/23/16.
 */
public class Main {

    public static void fight(Entity attacker, Entity target) {

    }

    public static void main(String[] args) {
        Player player = new Player();
        Hero mage = new Mage("meow", 5);
        Hero elfy = new Elf("elina", 10);
        Hero elf = new Elf("shion", 50);
        Mission mission = new Mission();
        GameView view;
        Controller mainController = new Controller(player);

        Map map = new Map();
        map.display();

        view = new GUIView(mainController);

        player.retrieveHeroList();
        for (Hero h: player.savedHeroes) {
            System.out.println(h);
        }
        //player.savedHeroes.add(mage);
        //player.savedHeroes.add(elfy);
        //player.savedHeroes.add(elf);
        //player.saveHeroList();

        //view.displayMainMenu();

        /*Mage mage = new Mage("A");
        Elf elf = new Elf("B");
        Devil devil = new Devil("X");
        Goblin goblin = new Goblin("Z");

        System.out.println(devil);
        mage.attacks();
        devil.receiveDamage(mage.getEffectiveAttackDamage());
        System.out.println(devil);*/
    }
}