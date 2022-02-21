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
<form action="#"method="POST"> <br />
<h1>Здравствуйте,<%= request.getParameter("name")%>!</h1>
<h2>Вы успешно зарегистрированы! <br/> Можете перейти на страницу просмотра сообщений </h2>
    <input formaction="message_page.jsp" formmethod="GET" type="submit" name="" value="К сообщениям" />
    <input formaction="signUp" formmethod="GET" type="submit" name="" value="На главную" />
</body>
</html>