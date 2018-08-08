<%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 07.08.2018
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
    <form action="Search.do">
        <html:text property="inputValue" name="searchBox"/>
        <br/>
        <input type="submit" value="search">
    </form>
</body>
</html>
