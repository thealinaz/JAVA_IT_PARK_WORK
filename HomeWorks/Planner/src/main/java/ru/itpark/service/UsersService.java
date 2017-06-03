package ru.itpark.service;

import ru.itpark.models.User;

import java.util.List;

/**
 * Created by Алина on 01.06.2017.
 */
public interface UsersService {
    boolean hasLogin(int userId, String login);
    User getUserById(int userId);
    void register(User user);
    List<User> getListOfUsers();
    void removeUser(int id);
    void update(User user);
}
