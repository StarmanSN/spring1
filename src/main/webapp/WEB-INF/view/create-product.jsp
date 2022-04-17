<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SAMBU
  Date: 02.04.2022
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h2>Add product</h2>

<form:form action="create" modelAttribute="product">

    <form:hidden path="id" value="${product.id}"/>
    Title: <form:input path="title"/>
    <br>
    Cost: <form:input path="cost"/>
    <br>
    <hr>
    <input type="submit" value="Submit">
</form:form>

</body>
</html>
