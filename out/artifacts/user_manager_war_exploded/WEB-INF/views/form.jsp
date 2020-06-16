<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/16/2020
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/add"> add customer</a>

    <table border="1 solid">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>email</td>
            <td>address</td>
            <td colspan="2">action</td>
        </tr>
        <c:forEach items="${list}" var="customer">
            <tr>
                <td>${customer.getId()}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <td><a href="/edit?id=${customer.getId()}" >edit</a></td>
                <td><a href="/delete?id=${customer.getId()}">delete</a></td>
            </tr>
        </c:forEach>

    </table>


</body>
</html>
