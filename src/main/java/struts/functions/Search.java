package struts.functions;

import struts.data.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16734683 on 07.08.2018.
 */
public class Search {

    private String inputValue;

    private final static Data DATA = Data.getInstance();

    private List<String> matchedCities = new ArrayList<>();

    public Search(String inputValue) {
        this.inputValue = inputValue;
    }

    public List<String> findMatches() {
        for (String city: DATA.getDb()) {
            if (inputValue.equals(city)) {
                matchedCities.add(city);
            }
        }
        return matchedCities;
    }
}
