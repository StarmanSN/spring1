<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: SAMBU
  Date: 02.04.2022
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List:</h1>
<hr>
<ul>

    <c:forEach var="product" items="${products}">
        <c:url var="viewUrl" value="/product/ + ${product.id}"/>
        <li>
            <a href="${viewUrl}">View</a>
            <br>
            Product id: ${product.id + 1}
            <br>
            Product title: ${product.title}
            <br>
            Product cost: ${product.cost}
            <br>
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="createUrl" value="/product/create"/>

<a href="${createUrl}">CREATE</a>

</ul>

</body>
</html>
