package service;


import dto.UsersDto;

import java.util.List;

public interface UsersService {
    List<UsersDto> getUsers();

    UsersDto getUser(int userId);

    List<UsersDto> getUsersByAge(int age);

    UsersDto updatePassword(int userId, String newPassword);

    UsersDto registerUser(UserDataForRegistrationDto registrationData);

    String login(String login, String password);
}
