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

    @GetMapping("/gift")
    List<Gift> allGifts(){
        return giftRepository.findAll();
    }

    @PostMapping("/gift")
    Gift createGift(@RequestBody Gift gift){
        return giftRepository.save(gift);
    }

}
