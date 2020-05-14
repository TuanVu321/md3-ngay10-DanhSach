<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/05/2020
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<form>
    <table class="table-bordered">
        <tr>
            <td>Ten</td>
            <td>Tuoi</td>
            <td>Dia chi</td>
            <td>So dien thoai</td>
        </tr>
        <c:forEach items="${list}" var="person">
            <tr>
                <td><c:out value="${person.getName()}"/></td>
                <td><c:out value="${person.getAge()}"/></td>
                <td><c:out value="${person.getAdress()}"/></td>
                <td><c:out value="${person.getPhone()}"/></td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
