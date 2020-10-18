package com.andrius.easyGift;

import com.andrius.easyGift.models.Role;
import com.andrius.easyGift.models.User;
import com.andrius.easyGift.models.UserGift;
import com.andrius.easyGift.repositories.UserGiftRepository;
import com.andrius.easyGift.repositories.UserRepository;
import com.andrius.easyGift.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class EasyGiftApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EasyGiftApplication.class, args);
    }


    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {

        userService.addInitialData();



    }
}
