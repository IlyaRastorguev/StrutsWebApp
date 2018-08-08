package struts.functions;

import struts.data.Data;


/**
 * Created by 16734683 on 07.08.2018.
 */
public class Search {

    private final static Data DATA = Data.getInstance();

    public Search() {
    }

    public void findMatches() {
        for (String city: DATA.getDb()) {
            if (DATA.getInputValue().toUpperCase().equals(city.toUpperCase())) {
                DATA.addMatch(city);
            }
        }
    }
}
