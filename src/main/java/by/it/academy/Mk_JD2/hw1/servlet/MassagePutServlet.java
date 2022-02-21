package by.it.academy.Mk_JD2.hw1.servlet;

import by.it.academy.Mk_JD2.hw1.api.IMessageService;
import by.it.academy.Mk_JD2.hw1.api.IUserService;
import by.it.academy.Mk_JD2.hw1.dto.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

@WebServlet(name = "MassagePutServlet", urlPatterns = "/message")
public class MassagePutServlet extends HttpServlet {

    private IUserService userService;
    private IMessageService messageService;

    public MassagePutServlet() {
        this.userService = UserService.getInstance();
        this.messageService = MessageService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        getServletContext().getRequestDispatcher("/message_page.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User user = (User) req.getSession().getAttribute("newUser");

        String sender = user.getLogin();
        String login = req.getParameter("login");
        String text = req.getParameter("text");

        if (Objects.equals(login, "") || Objects.equals(text, "")) {
            getServletContext().getRequestDispatcher("/info2_message.jsp").forward(req, resp);
        }

        if (!userService.getFromStorage().containsKey(login)) {
            getServletContext().getRequestDispatcher("/login_retry.jsp").forward(req, resp);

        } else {
            Message message = new Message(login, text, sender, LocalDateTime.now());
            messageService.addToStorage(login, message);
            req.getSession().setAttribute("newMessage", message);
            getServletContext().getRequestDispatcher("/message_send.jsp").forward(req, resp);
        }
    }
}
