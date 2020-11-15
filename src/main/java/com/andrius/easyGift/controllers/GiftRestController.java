package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.repositories.GiftRepository;
import com.andrius.easyGift.services.GiftService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class GiftRestController {

    private final GiftService giftService;

    @GetMapping("/gifts")
    List<Gift> allGiftsSorted() {
        return giftService.getGiftsListSorted();
    }

    @PostMapping("/gifts")
    Gift createGift(@RequestBody Gift gift) {
        return giftService.saveGift(gift);
    }


}
