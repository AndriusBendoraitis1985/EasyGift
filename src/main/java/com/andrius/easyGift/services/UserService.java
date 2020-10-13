package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Role;
import com.andrius.easyGift.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public List<User> addInitialUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(
                "Andrus",
                "Bendoraitis",
                "andben@gmail.com",
                "root"
                , Role.ADMIN,
                LocalDate.of(1985, 6,21)
        ));
        users.add(new User(
                "Elvyra",
                "Bendoraitiene",
                "elvben@gmail.com",
                "test"
                , Role.USER,
                LocalDate.of(1985, 6,21)
        ));

        return users;
    }
}
