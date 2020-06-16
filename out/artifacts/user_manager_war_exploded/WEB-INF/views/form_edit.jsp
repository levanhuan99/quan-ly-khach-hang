<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/16/2020
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/save?oldID=${oldId}" method="post">
    <table>
        <tr>
            <td><input type="number" name="id" value="${customerEdit.getId()}"></td>
            <td><input type="text" name="name" value="${customerEdit.getName()}"></td>
            <td><input type="text" name="email" value="${customerEdit.getEmail()}"></td>
            <td><input type="text" name="address" value="${customerEdit.getAddress()}"></td>
        </tr>
        <tr><td><input type="submit"></td></tr>
    </table>

</form>
</body>
</html>
