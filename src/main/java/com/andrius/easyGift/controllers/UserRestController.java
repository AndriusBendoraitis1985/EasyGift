package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.User;
import com.andrius.easyGift.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserRepository userRepository;


    @GetMapping("/users")
    List<User> allUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/users")
    User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
