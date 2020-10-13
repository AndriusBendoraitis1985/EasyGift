package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.User;
import com.andrius.easyGift.repositories.UsersRepository;
import com.andrius.easyGift.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserRestController {

    private final UserService userService;
    private final UsersRepository usersRepository;
    
    @GetMapping ("/users")
    List<User> allUsers(){
        userService.addInitialUsers();
        return usersRepository.findAll();
    }

    @PostMapping("/users")
    User createUser(@RequestBody User user){
        return usersRepository.save(user);
    }
}
