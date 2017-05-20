package ru.itpark.servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
        /*
        PrintWriter writer = response.getWriter();
        writer.write("<h1> Hello </h1>");
        writer.write("<table>");
        List<User> userList = usersService.getListOfUsers();
        for (User user : userList) {
            writer.write("<tr>");
            writer.write("<td>" + user.getId() + "</td>");
            writer.write("<td>" + user.getAge() + "</td>");
            writer.write("<td>" + user.getName() + "</td>");
            writer.write("</tr>");
        }
        writer.write("</table>");
        */
        String view = request.getParameter("view");
        if (view != null && view.equals("list")) {
            List<User> userList = usersService.getListOfUsers();
            request.setAttribute("users", userList);
            request.getRequestDispatcher("/jsp/users.jsp").forward(request, response);
        } else {
            String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));
            User user = new User(name, age);
            usersService.register(user);
        }
    }


}
