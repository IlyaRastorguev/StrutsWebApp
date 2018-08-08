package struts.actions;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import struts.data.Data;
import struts.functions.Search;
import struts.web.SearchBoxForm;
import struts.web.SearchResultsForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 16734683 on 07.08.2018.
 */
public class GetSearchResult extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Data.getInstance().clear();
        SearchBoxForm searchBoxForm = (SearchBoxForm) form;
        Data.getInstance().setInputValue(searchBoxForm.getInputValue());
        Search search = new Search();
        search.findMatches();
        request.setAttribute("resultsList", Data.getInstance().getMatches());
        return mapping.findForward("showSearchResult");
    }
}
