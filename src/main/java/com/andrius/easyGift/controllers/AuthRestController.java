package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.authorization.AuthRequest;
import com.andrius.easyGift.models.authorization.AuthResponse;
import com.andrius.easyGift.models.authorization.RegRequest;
import com.andrius.easyGift.models.User;
import com.andrius.easyGift.services.UserService;
import com.andrius.easyGift.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthRestController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/authenticate")
    public AuthResponse generateToken(@RequestBody AuthRequest authRequest){
        User user = userService.findByUserNameAndPassword(authRequest.getUserName(), authRequest.getPassword());
        String token = jwtUtil.generateToken(user.getUserName());

        return new AuthResponse(token, user);
    }

}
