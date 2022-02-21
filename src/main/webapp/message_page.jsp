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
<h2> Эта страница просмотра и отправки сообщений.</h2> <br />
<h3>Выберите действие</h3> <br />
    <input formaction="chats" formmethod="GET" type="submit" name="" value="Просмотреть мои сообщения" /> <br />
    <input formaction="message_write.jsp" formmethod="GET" type="submit" name="" value="Написать сообщение" />
</body>
</html>