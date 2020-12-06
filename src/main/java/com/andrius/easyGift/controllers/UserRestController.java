package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.User;
import com.andrius.easyGift.models.authorization.RegRequest;
import com.andrius.easyGift.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    List<User> allUsers() {
        return userService.getAllUsers();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/user")
    User getUserByUserName(@RequestBody String username) {
        return userService.findUsersByUserName(username);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/users")
    User saveNewUser(@RequestBody RegRequest regRequest) {
        return userService.saveNewUser(regRequest);
    }
}
