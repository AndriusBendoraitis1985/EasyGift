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
    @GetMapping("/users/{userName}")
    User getUserByUserName(@PathVariable String userName) {
        return userService.findUsersByUserName(userName);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/user/new")
    User saveNewUser(@RequestBody RegRequest regRequest) {
        return userService.saveNewUser(regRequest);
    }
}
