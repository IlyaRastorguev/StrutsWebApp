<%--
Created by IntelliJ IDEA.
  User: 16734683
  Date: 07.08.2018
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>

        <h1>TEST</h1>
        <br/>
        Searching results for <bean:write  property="inputValue" name="searchBox"/>
        <br/>

        <logic:iterate id="searchResults" name="resultsList">
            <bean:write name="searchResults"/>
        </logic:iterate>
    </body>
</html>
