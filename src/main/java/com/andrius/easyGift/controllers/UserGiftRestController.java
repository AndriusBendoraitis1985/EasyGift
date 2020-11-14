//package com.andrius.easyGift.controllers;
//
//import com.andrius.easyGift.models.UserGift;
//import com.andrius.easyGift.repositories.UserGiftRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class UserGiftRestController {
//    private final UserGiftRepository userGiftRepository;
//
//    @GetMapping("/usergift")
//    List<UserGift> allUserGifts(){
//        return userGiftRepository.findAll();
//    }
//
//    @PostMapping("/usergift")
//    UserGift createUserGift(@RequestBody UserGift userGift){
//        return userGiftRepository.save(userGift);
//    }
//}
