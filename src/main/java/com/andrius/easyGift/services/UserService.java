package com.andrius.easyGift.services;

import com.andrius.easyGift.models.User;
import com.andrius.easyGift.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers (){
        return userRepository.findAll();
    }

    public User getUsersByUserName (String userName){
        return userRepository.findUserByUserName(userName);
    }

}
