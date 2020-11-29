package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.User;
import com.andrius.easyGift.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @GetMapping ("/users")
    List<User> allUsers() {
        return userService.getAllUsers();
    }

    @GetMapping ("/user")
    User getUserByUserName(@RequestBody String username) {
        return userService.getUsersByUserName(username);
    }
}
