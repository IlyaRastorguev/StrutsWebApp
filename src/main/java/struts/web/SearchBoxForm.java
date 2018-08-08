package struts.web;

import org.apache.struts.action.ActionForm;

/**
 * Created by 16734683 on 07.08.2018.
 */
public class SearchBoxForm extends ActionForm {

    private String inputValue = "";

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }

}
