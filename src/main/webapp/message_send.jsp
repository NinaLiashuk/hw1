<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>User Info</title>
    </head>
<body>
<form action="" method="GET">
<h1>Сообщение <%=request.getParameter("login")%> отправлено</h1>
    <input formaction="signUp" formmethod="GET" type="submit" name="" value="На главную" />
</body>
</html>