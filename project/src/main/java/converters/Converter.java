package converters;


import models.User;

import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    public static UserDto convert(User model) {
        return new UserDto(model.getId(), model.getAge(), model.getName());
    }

    public static List<UserDto> convert(List<User> models) {
        return models.stream()
                .map(user -> convert(user)).collect(Collectors.toList());
    }
}