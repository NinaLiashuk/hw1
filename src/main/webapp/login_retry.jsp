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
<form action=""method="POST">
<br />
<h1>Такого логина не существует. Предлагаем пройти регистрацию!</h1> <br />
    <input formaction="enter_page.jsp" formmethod="GET" type="submit" name="" value="К форме входа" />
    <input formaction="registration_page.jsp" formmethod="GET" type="submit" name="" value="К форме регистрации" />
</body>
</html>