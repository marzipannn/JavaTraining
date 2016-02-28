package rpg;
import rpg.villains.*;

/**
 * Created by Cinnamon on 2/25/16.
 */
public class Mission {
    private Villain[] monsters;
    private void playMissionOne(Player player) {
        int turn = 0;

        Villain villain = new Goblin("Flame");
        villain.setLevel(5);
        while (turn < 2) {
            if (turn % 2 == 0) {
                villain.receiveDamage(player.hero.dealDamage());
                //player.hero.attacks();
                System.out.println(villain);
            }
            turn++;
        }
    }
    public void playMission(int index, Player player) {
        if (index == 1)
            playMissionOne(player);
    }
}
