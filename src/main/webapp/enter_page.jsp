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
<form action="signIn"method="POST"> <br />
<h2> Приветствуем! Введите логин и пароль</h2>
    Login: <input type="text" name="login"><br />
    Password: <input type="text" name="password" /><br />
    <input type="submit" value="Отправить" />
</body>
</html>