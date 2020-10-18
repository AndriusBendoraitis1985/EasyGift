package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.models.Role;
import com.andrius.easyGift.models.User;
import com.andrius.easyGift.models.UserGift;
import com.andrius.easyGift.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void addInitialData() {
        User andrius = new User("Andrius", "Bendoraitis", "andben@gmail.com", "root", Role.ADMIN, LocalDate.of(1985, 6,
                21));
        User elvyra = new User("Elvyra", "Bendoraitiene", "elvben@gmail.com", "test", Role.USER, LocalDate.of(1991, 1,
                20));

        UserGift userGift1 = new UserGift(LocalDate.of(1985, 6, 21), "Birthday");
        userGift1.setUser(andrius);
        UserGift userGift2 = new UserGift(LocalDate.of(2013, 7, 20), "Weddings anniversary");
        userGift2.setUser(andrius);
        UserGift userGift3 = new UserGift(LocalDate.of(2013, 7, 20), "Weddings anniversary");
        userGift3.setUser(elvyra);

        List<UserGift> userGiftsForAndrius = Arrays.asList(userGift1, userGift2);
        List<UserGift> userGiftsForElvyra = Arrays.asList(userGift3);

        Gift trip = new Gift("Trip to Paris", "no picture", "www.paris.fr");
        Gift pie = new Gift("Apple pie", "no picture", "www.pie.com");
        Gift bicycle = new Gift("Bicycle", "no picture", "www.bikko.lt");
        Gift vine = new Gift("Vine", "no picture", "www.vine.com");
        trip.setUserGift(userGift1);
        pie.setUserGift(userGift2);
        bicycle.setUserGift(userGift1);
        vine.setUserGift(userGift3);

        List<Gift> birthdayGifts = Arrays.asList(trip, bicycle);
        List<Gift> weddingsGifts = Arrays.asList(pie);
        List<Gift> otherGifts = Arrays.asList(vine);

        userGift1.setGiftList(birthdayGifts);
        userGift2.setGiftList(weddingsGifts);
        userGift3.setGiftList(otherGifts);

        andrius.setUserGifts(userGiftsForAndrius);
        elvyra.setUserGifts(userGiftsForElvyra);
        userRepository.save(andrius);
        userRepository.save(elvyra);
    }

}
