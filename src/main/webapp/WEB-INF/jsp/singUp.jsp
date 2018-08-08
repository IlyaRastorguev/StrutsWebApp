<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 08.08.2018
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sing Up</title>
</head>
<body style="width: 100%; height: 100%; align-content: center">
    <html:form>

        User name:
        <html:text property="userName" name="userName"/>

        Password:
        <html:text property="passwordMain" name="passwordMain"/>

        Repeat password:
        <html:text property="passwordSecond" name="passwordSecond"/>

        Email:
        <html:text property="email" name="email"/>
        <br/>

        <input type="submit" value="Sing up" formaction="SingUp.do">
    </html:form>

</body>
</html>
