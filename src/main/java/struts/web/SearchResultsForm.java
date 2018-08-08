package struts.web;

import org.apache.struts.action.ActionForm;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsForm extends ActionForm {

    private String searchingWord = "";

    private List<String> result = new ArrayList<>();


    public List<String> getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result.add(result);
    }

    public String getSearchingWord() {
        return searchingWord;
    }

    public void setSearchingWord(String searchingWord) {
        this.searchingWord = searchingWord;
    }
}
