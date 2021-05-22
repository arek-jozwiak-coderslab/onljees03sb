<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: arek
  Date: 20.05.2021
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="app.title"/></title>
</head>
<body>
    <h1><spring:message code="app.title"/></h1>
<table>
    <tr>
        <th>Id</th>
        <th>name</th>
        <th>rating</th>
    </tr>
    <c:forEach items="${toys}" var="toy">
        <tr>
            <td>${toy.id}</td>
            <td>${toy.name}</td>
            <td>${toy.rating}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
