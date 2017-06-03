package ru.itpark;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import ru.itpark.models.User;
import ru.itpark.service.UsersService;

import java.util.List;

/**
 * Created by Алина on 02.06.2017.
 */
public class Main {

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("db");
        context.load("ru.itpark\\context.xml");
        context.refresh();
        UsersService usersService = context.getBean(UsersService.class);
        User user = new User("lol", "chepochem555aye", "Kirill",
                "Kirillov", 23, "xz@mail.ru");
        usersService.register(user);
        User alinaFromBd = usersService.getUserById(1);
        System.out.println(alinaFromBd.getId() + " " + alinaFromBd.getLogin()+ " " + alinaFromBd.getPassword()
                + " " + alinaFromBd.getFirstName()+ " " + alinaFromBd.getLastName()+ " " + alinaFromBd.getAge()
                + " " + alinaFromBd.getEmail());

        List<User> users = usersService.getListOfUsers();
        System.out.println(users);
        usersService.removeUser(2);
        User lena = new User(1, "elenka555", "lolkek555", "Elena",
                "Kekovna", 25, "elenkakek@mail.ru");
        usersService.update(lena);
    }
}
