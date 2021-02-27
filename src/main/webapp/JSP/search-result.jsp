<%--
  Created by IntelliJ IDEA.
  User: alona
  Date: 17/01/2021
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.apache.logging.log4j.LogManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    LogManager.getLogger("search-result.jsp").debug("Display search-result.jsp");
%>
<html>
<body>
<h2>Your name: ${name}</h2>
<br/>
<a href="/search">Try again</a>
</body>
</html>
