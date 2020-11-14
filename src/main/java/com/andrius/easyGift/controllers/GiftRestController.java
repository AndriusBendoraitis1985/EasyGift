//package com.andrius.easyGift.controllers;
//
//import com.andrius.easyGift.models.GiftV0;
//import com.andrius.easyGift.repositories.GiftRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequiredArgsConstructor
//public class GiftRestController {
//    private final GiftRepository giftRepository;
//
//    @GetMapping("/gift")
//    List<GiftV0> allGifts(){
//        return giftRepository.findAll();
//    }
//
//    @PostMapping("/gift")
//    GiftV0 createGift(@RequestBody GiftV0 gift){
//        return giftRepository.save(gift);
//    }
//
//}
