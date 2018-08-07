package struts.functions;

import struts.data.Data;


/**
 * Created by 16734683 on 07.08.2018.
 */
public class Search {

    private String inputValue;

    private final static Data DATA = Data.getInstance();

    public Search(String inputValue) {
        this.inputValue = inputValue;
    }

    public void findMatches() {
        for (String city: DATA.getDb()) {
            if (inputValue.toUpperCase().equals(city)) {
                DATA.addMatch(city);
            }
        }
    }
}
