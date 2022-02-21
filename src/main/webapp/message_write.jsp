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
<form action="message"method="POST">
<h2> Напишите сообщение.</h2> <br /><br />
    Кому: <input type="text" name="login" ><br />
    Текст: <input type="text" name="text"><br />
    <input type="submit" value="Отправить" />
</body>
</html>