<%--
  Created by IntelliJ IDEA.
  User: 16734683
  Date: 07.08.2018
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
</head>
<body>
    <form action="GetResults.do">
        <input id="search_box" placeholder="Enter name of the city" property="inputValue" onchange="this.form.submit()">
    </form>
</body>
</html>
