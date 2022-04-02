<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: SAMBU
  Date: 02.04.2022
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Message</title>
</head>
<body>
<form:form action="create" modelAttribute="message">
    <form:hidden path="id" value="${message.id}"/>
    From: <form:input path="from"/>
    <br>
    To: <form:input path="to"/>
    <br>
    Message: <form:textarea path="body"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
