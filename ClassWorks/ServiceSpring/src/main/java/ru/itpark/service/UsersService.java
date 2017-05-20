package ru.itpark.service;

import ru.itpark.models.User;

import java.util.List;

public interface UsersService {
    boolean hasName(int userId, String name);
    User getUserById(int userId);
    void register(User user);
    List<User> getListOfUsers();
    void removeUser(int id);
    void update(User user);
}
