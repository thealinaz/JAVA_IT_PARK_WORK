package service;

import dao.UsersDao;
import models.User;

import java.util.List;

/**
 * Created by Алина on 20.05.2017.
 */
public class UsersServiceImpl {
    private UsersDao usersDao;

    public UsersServiceImpl(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public boolean hasName(int userId, String firstName, String lastName) {
        User user = usersDao.find(userId);
        return user.getFirstName().equals(firstName) &&
                user.getLastName().equals(lastName);
    }

    public User getUserById(int userId) {
        return usersDao.find(userId);
    }

    public void register(User user) {
        usersDao.save(user);
        System.out.println("USER ID " + user.getId() + " registered");
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
