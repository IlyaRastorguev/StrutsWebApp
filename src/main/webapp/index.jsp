<%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 06.08.2018
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
  <head>
    <title>Struts page</title>
  </head>
  <body>
  <h2>Test page</h2>
  <form action="">
    <input formaction="GetLogin.do" type="submit" value="Login">
    <input formaction="GetSingUp.do" type="submit" value="Sing up">
  </form>
  </body>
</html>
