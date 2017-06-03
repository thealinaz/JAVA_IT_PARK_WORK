package ru.itpark.service;

import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;

import java.util.List;

/**
 * Created by Алина on 01.06.2017.
 */
public class UsersServiceImpl implements UsersService {
    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public boolean hasLogin(int userId, String login) {
        User user = usersDao.find(userId);
        return user.getLogin().equals(login);
    }

    public User getUserById(int userId) {
        return usersDao.find(userId);
    }

    public void register(User user) {
        System.out.println("USER ID " + usersDao.save(user));
    }

    public List<User> getListOfUsers() {
        return usersDao.findAll();
    }

    public void removeUser(int id) {
        usersDao.delete(id);
    }

    public void update(User user) {
        usersDao.update(user);
    }
}
