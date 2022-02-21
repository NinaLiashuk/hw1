package by.it.academy.Mk_JD2.hw1.servlet;

import by.it.academy.Mk_JD2.hw1.api.IMessageService;
import by.it.academy.Mk_JD2.hw1.dto.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "MassageReadServlet", urlPatterns = "/chats")
public class MassageReadServlet extends HttpServlet {

    private IMessageService messageService;

    public MassageReadServlet() {
        this.messageService = MessageService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        Map<String, Message> listMessage = messageService.getFromStorage();
        User user = (User) req.getSession().getAttribute("thisUser");

        String login = user.getLogin();

        if (messageService.getFromStorage().containsKey(login)){
            req.setAttribute("listMessage",listMessage);
            getServletContext().getRequestDispatcher("/message_read.jsp").forward(req, resp);
        }
        else {
            getServletContext().getRequestDispatcher("/message_page.jsp").forward(req, resp);
        }
    }
}
