<%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 08.08.2018
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Login</title>
</head>
<body style="width: 100%; height: 100%; align-content: center">
    <html:form style="margin-left: auto; margin-top: auto">
        User name:
        <html:text property="userName" name="loginForm"/>
        <br/>
        Password:
        <html:text property="password" name="loginForm"/>
        <br/>

        <input type="submit" value="Login" formaction="Login.do">
    </html:form>

</body>
</html>
