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

    private String inputValue;

    private List<String> cities = new ArrayList<>();

    private List<String> matches = new ArrayList<>();

    private void add() {
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("Paris");
    }

    public void clear() {
        inputValue = "";
        matches = new ArrayList<>();
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

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }
}
