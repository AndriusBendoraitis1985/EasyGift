package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.services.GiftService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class GiftRestController {

    private final GiftService giftService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/gifts")
    List<Gift> allGiftsSorted() {
        return giftService.getGiftsListSorted();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/gifts/{id}")
    Gift getGiftById(@PathVariable Long id) {
        return giftService.getGiftById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/gifts")
    Gift createGift(@RequestBody Gift gift) {
        return giftService.saveGift(gift);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/gifts/{id}")
    Gift updateGift(@RequestBody Gift gift, @PathVariable Long id) {
        return giftService.updateGift(gift, id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/gifts/{id}")
    Gift deleteGiftById(@PathVariable Long id){
        return giftService.deleteGift(id);
    }
}
