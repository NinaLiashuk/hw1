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
<form action="signUp"method="POST"><br />
<h2> Приветствуем на странице регистрации. Зарегистрируйтесь</h2>
    Name: <input type="text" name="name" ><br />
    Login: <input type="text" name="login"><br />
    Password: <input type="text" name="password" /><br />
    Birthday: <input type="text" name="birthday" /><br />
    <input type="submit" value="Зарегистрироваться" />
</body>
</html>