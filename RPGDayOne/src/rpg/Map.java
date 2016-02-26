package rpg;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Cinnamon on 2/26/16.
 */
public class Map {
    private ArrayList<String> map;

    public Map() {
        getMap(1);
    }
    public Map(int i) {
        getMap(i);
    }
    private void getMap(int i) {
        File dir = new File(".");
        BufferedReader br;
        File fin;
        String line;

        try {
            fin = new File(dir.getCanonicalPath() + "/RPGDayOne/src/rpg/maps/" + "map" + i);
            br = new BufferedReader(new FileReader(fin));
        }
        catch (IOException exception) {
            System.out.println(exception.toString());
            return;
        }
        map = new ArrayList<String>();
        while (true) {
            try {
                line = br.readLine();
                if (line != null) {
                    map.add(line);
                }
                else {
                    br.close();
                    break;
                }
            }
            catch (IOException exception) {
                System.out.println(exception.toString());
            }
        }
    }

    public void display() {
        if (map != null) {
            for (String line: map) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == '.')
                        System.out.print("   ");
                    else if (c == '#')
                        System.out.print("[ ]");
                    else if (c == 'm')
                        System.out.print("[M]");
                    else if (c == 'a')
                        System.out.print("[?]");
                    if (i < line.length() - 1)
                        System.out.print(" ");
                }
                System.out.println("");
            }
        }
        else
            System.out.println("No map available.");
    }
}
