package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Role;
import com.andrius.easyGift.models.User;
import com.andrius.easyGift.repositories.RoleRepository;
import com.andrius.easyGift.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RoleRepository roleRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUsersByUserName(String userName) {
        return userRepository.findUserByUserName(userName);
    }

    public User findByUserNameAndPassword(String userName, String password) {
        User user = findUsersByUserName(userName);
        if (user != null) {
            if (passwordEncoder.matches(password, user.getPassword())) {
                return user;
            }
        }
        return null;
    }

    public User saveNewUser(User user) {
        Role role = roleRepository.findByName("ROLE_USER");
        user.setRole(role);
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

}
