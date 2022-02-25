package by.it.academy.Mk_JD2.hw1.servlet;

import by.it.academy.Mk_JD2.hw1.api.IUserService;
import by.it.academy.Mk_JD2.hw1.dto.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "UserSignUpServlet", urlPatterns = "/signUp")
public class UserSignUpServlet extends HttpServlet {

    private IUserService userService;
    private User user;

    public UserSignUpServlet() {
        this.userService = UserService.getInstance();
        this.user = new User();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");

        getServletContext().getRequestDispatcher("/main_page.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String birthday = req.getParameter("birthday");

        HttpSession session = req.getSession();

        if (Objects.equals(name, "") || Objects.equals(login, "") || Objects.equals(password, "") || Objects.equals(birthday, "")) {
            getServletContext().getRequestDispatcher("/info2_message.jsp").forward(req, resp);
        }

        if (userService.getFromStorage().containsKey(login)) {
            getServletContext().getRequestDispatcher("/registration_retry.jsp").forward(req, resp);

        } else {
            User user = new User(name, login, password, birthday);
            userService.addToStorage(user);
            getServletContext().getRequestDispatcher("/registration_success.jsp").forward(req, resp);
            req.getSession().setAttribute("user",user);
        }
    }
}
