package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Role;
import com.andrius.easyGift.models.User;
import com.andrius.easyGift.models.authorization.RegRequest;
import com.andrius.easyGift.repositories.RoleRepository;
import com.andrius.easyGift.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/register")
    public User saveNewUser(@RequestBody RegRequest regRequest) {
        User user = new User();
        Role role = roleRepository.findByName("ROLE_USER");
        String encodedPassword = passwordEncoder.encode(regRequest.getPassword());
        user.setUserName(regRequest.getUserName());
        user.setPassword(encodedPassword);
        user.setEmail(regRequest.getEmail());
        user.setLogoPath(regRequest.getLogoPath());
        user.setRole(role);
        return userRepository.save(user);
    }

}
