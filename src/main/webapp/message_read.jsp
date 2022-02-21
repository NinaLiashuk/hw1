<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>User Info</title>
    </head>
<body>
<form action="#"method="GET">
<h2> Вот, что вам пришло --> </h2>

<c:forEach items="${listMessage}" var="listMessage">
    <c:out value="${listMessage}" />
</c:forEach>
<input formaction="signUp" formmethod="GET" type="submit" name="" value="На главную" />
</body>
</html>