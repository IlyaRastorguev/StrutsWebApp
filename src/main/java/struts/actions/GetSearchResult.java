package struts.actions;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import struts.functions.Search;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by 16734683 on 07.08.2018.
 */
public class GetSearchResult extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception {
        Search search = new Search(inputValue);
        search.findMatches();
        return mapping.findForward("showResults");
    }

    private String inputValue;

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }
}
