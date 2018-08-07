<%@ page import="struts.functions.Search" %>
<%@ page import="struts.data.Data" %><%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 07.08.2018
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>TEST</h1>
<ul>
    <%
        for (String city: Data.getInstance().getMatches()) {
            System.out.println("<li>" + city + "</li>");
        }
    %>
</ul>
</body>
</html>
