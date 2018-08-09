package struts.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.functions.LoginDataChecker;
import struts.web.LoginForm;

public class LoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        LoginForm loginForm = (LoginForm) form;
        if (new LoginDataChecker(loginForm.getUserName(), loginForm.getPassword()).getResult()) {
            return mapping.findForward("successfullyLogin");
        } else {
            return mapping.findForward("hasError");
        }
    }
}
