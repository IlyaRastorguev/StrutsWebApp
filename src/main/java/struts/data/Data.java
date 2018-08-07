package struts.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16734683 on 07.08.2018.
 */
public class Data {
    private static Data ourInstance = new Data();

    public static Data getInstance() {
        return ourInstance;
    }

    private Data() {
        add();
    }

    private List<String> cities = new ArrayList<>();

    private List<String> matches = new ArrayList<>();

    private void add() {
        cities.add("БЕРЛИН");
        cities.add("МОСКВА");
        cities.add("ПАРИЖ");
    }

    public void addMatch(String s) {
        matches.add(s);
    }

    public List<String> getDb() {
        return cities;
    }

    public List<String> getMatches() {
        return matches;
    }
}
