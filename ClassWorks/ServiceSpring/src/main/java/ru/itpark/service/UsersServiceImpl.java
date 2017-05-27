package ru.itpark.service;


import ru.itpark.dao.UsersDao;
import ru.itpark.models.User;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }


    public boolean hasName(int userId, String name) {
        User user = usersDao.find(userId);
        return user.getName().equals(name);
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
