package controllers;


import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        return Lists.newArrayList(usersService.getUsers());
    }

    @GetMapping("/users/{user-id}")
    public UserDto getUser(@PathVariable("user-id") int userId) {
        return usersService.getUser(userId);
    }

    @GetMapping(value = "/users", params = "filter=age")
    public List<UserDto> getUsersByAge(@RequestParam("age") int age) {
        return usersService.getUsersByAge(age);
    }

    @PutMapping(value = "/users/{user-id}")
    public UserDto updatePassword(@PathVariable("user-id") int userId,
                                  @RequestHeader("new_password") String newPassword) {
        return usersService.updatePassword(userId, newPassword);
    }

    @PostMapping("/users")
    public UserDto register(@RequestBody UserDataForRegistrationDto registrationData) {
        return usersService.registerUser(registrationData);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestHeader("password") String password,
                                        @RequestHeader("login") String login) {
        String token = usersService.login(login, password);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Auth-Token", token);
        return new ResponseEntity<>(null, headers, HttpStatus.ACCEPTED);
    }
}
