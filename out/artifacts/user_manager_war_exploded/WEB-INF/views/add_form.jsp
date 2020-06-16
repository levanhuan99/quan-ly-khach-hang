<%--
  Created by IntelliJ IDEA.
  User: VanHuan
  Date: 6/16/2020
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save_new_customer" method="post">
    <table>
        <tr>
            <td><input type="number" name="id" ></td>
            <td><input type="text" name="name" ></td>
            <td><input type="text" name="email"></td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr><td><input type="submit"></td></tr>
    </table>

</form>
</body>
</html>
