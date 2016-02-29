package rpg;
import rpg.heroes.*;
import java.io.*;

import java.nio.channels.FileChannel;
import java.util.ArrayList;

/**
 * Created by Cinnamon on 2/25/16.
 */
public class Player {
    public Hero hero;
    public ArrayList<Hero> savedHeroes;

    public Player() {
        savedHeroes = new ArrayList<Hero>();
    }

    public void retrieveHeroList() {
        File dir = new File(".");
        FileInputStream streamIn;
        ObjectInputStream objectinputstream;

        try {
            streamIn = new FileInputStream(dir.getCanonicalPath() + "/RPGDayOne/src/rpg/saved_heroes.ser");
            objectinputstream = new ObjectInputStream(streamIn);
//            ArrayList<Hero>temp = (ArrayList<Hero>) objectinputstream.readObject();
            savedHeroes = (ArrayList<Hero>) objectinputstream.readObject();

            //savedHeroes.addAll(temp);
            objectinputstream.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

    public void saveHeroList() {
        File dot = new File(".");

        try {
            File heroFile = new File(dot.getCanonicalPath() +  "/RPGDayOne/src/rpg/saved_heroes.ser");
            FileChannel outChan = new FileOutputStream(heroFile, true).getChannel();
            outChan.truncate(0);
            outChan.close();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }

        ObjectOutputStream oos;
        FileOutputStream fout;
        try {
            fout = new FileOutputStream(dot.getCanonicalPath() + "/RPGDayOne/src/rpg/saved_heroes.ser", true);
            oos = new ObjectOutputStream(fout);
            oos.writeObject(savedHeroes);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
