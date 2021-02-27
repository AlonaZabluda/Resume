<%--
  Created by IntelliJ IDEA.
  User: alona
  Date: 17/01/2021
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.apache.logging.log4j.LogManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    LogManager.getLogger("search-form.jsp").debug("Display search-form.jsp");
%>
<html>
<body>
<h2>Input name</h2>
<c:if test="${invalid}">
    <h5 style="color:red;">Please input correct value!!!</h5>
</c:if>
<form action="/search" method="post">
    <input name="query" />
    <input type="submit" value="Search" />
</form>
</body>
</html>
