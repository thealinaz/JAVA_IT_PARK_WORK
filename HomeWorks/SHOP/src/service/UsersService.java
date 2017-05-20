package service;

import models.User;

import java.util.List;

/**
 * Created by Алина on 20.05.2017.
 */
public interface UsersService {
    boolean hasName(int customerId, String name);
    User getUserById(int userId);
    void register(User user);
    List<User> getListOfUsers();
    void removeUser(int id);
    void update(User user);
}
