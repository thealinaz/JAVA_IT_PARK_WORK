package ru.itpark.servlet;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Алина on 01.06.2017.
 */
public class UsersServlet extends HttpServlet {
    private UsersService usersService;

    @Override
    public void init() throws ServletException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("db");
        context.load("ru.itpark\\context.xml");
        context.refresh();
        usersService = context.getBean(UsersService.class);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = usersService.getListOfUsers();
        request.setAttribute("users", userList);
        request.getRequestDispatcher("/jsp/users.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");

        User user = new User(login, password, firstName, lastName, age, email);
        usersService.register(user);
        List<User> userList = usersService.getListOfUsers();
        req.setAttribute("users", userList);
        req.getRequestDispatcher("/jsp/users.jsp").forward(req, resp);
    }
}
