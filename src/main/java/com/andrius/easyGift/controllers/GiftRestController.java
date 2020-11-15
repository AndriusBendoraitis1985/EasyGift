package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.repositories.GiftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class GiftRestController {

    private final GiftRepository giftRepository;

    @GetMapping("/gifts")
    List<Gift> allGifts() {
        return giftRepository.findAll();
    }

    @PostMapping("/gifts")
    Gift createGift(@RequestBody Gift gift) {
        return giftRepository.save(gift);
    }

    @PutMapping("/gifts/like")
    Gift likeToGift(@RequestBody Gift gift){
        return giftRepository.save(gift);
    }

}
