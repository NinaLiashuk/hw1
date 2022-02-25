package by.it.academy.Mk_JD2.hw1.servlet;

import by.it.academy.Mk_JD2.hw1.api.IUserService;
import by.it.academy.Mk_JD2.hw1.dto.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;

@WebServlet(name = "UserSignInServlet", urlPatterns = "/signIn")
public class UserSignInServlet extends HttpServlet {

    private IUserService userService;

    public UserSignInServlet() {
        this.userService = UserService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/enter_page.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        Map<String, User> users = userService.getFromStorage();

        if (Objects.equals(login, "") || Objects.equals(password, "")) {
            getServletContext().getRequestDispatcher("/info2_message.jsp").forward(req, resp);
        }

        if (users.containsKey(login) && users.get(login).getPassword().equals(password)){
            req.getSession().setAttribute("user", users.get(login));
            getServletContext().getRequestDispatcher("/message_page.jsp").forward(req, resp);
        } if (users.containsKey(login) && !users.get(login).getPassword().equals(password)){
            getServletContext().getRequestDispatcher("/password_retry.jsp").forward(req, resp);
        } if(!users.containsKey(login)) {
            getServletContext().getRequestDispatcher("/login_retry.jsp").forward(req, resp);
        }
    }
}
