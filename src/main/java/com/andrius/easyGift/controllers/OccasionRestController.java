package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.GiftRepository;
import com.andrius.easyGift.repositories.OccasionRepository;
import com.andrius.easyGift.services.OccasionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OccasionRestController {

    private final OccasionService occasionService;
    private final OccasionRepository occasionRepository;
    private final GiftRepository giftRepository;

    @GetMapping("/events")
    List<Occasion> allOccasions() {
        return occasionService.getAllOccasions();
    }

    @PostMapping("/events")
    Occasion createdOccasion(@RequestBody Occasion occasion) {
        return occasionService.addOccasion(occasion);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/events/gifts/{giftId}")
    Gift addLikeToGift(@RequestBody Occasion occasion, @PathVariable Long giftId) throws IllegalArgumentException {
        Gift gift =
                giftRepository.findById(giftId).orElseThrow(() -> new IllegalArgumentException("gift with id" + giftId +
                        "not found"));
        gift.setRating(gift.getRating() + 1);
        gift.setOccasion(occasion);
        return giftRepository.save(gift);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/events/{id}")
    Occasion occasionById(@PathVariable Long id) {
        return occasionService.getOccasionById(id);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/events/{id}")
    void deleteById(@PathVariable Long id) {
        occasionService.deleteOccasionById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/events/{occasionId}/new")
    Occasion addNewGift (@RequestBody Gift gift, @PathVariable Long occasionId){
        return occasionService.addNewGift(gift, occasionId);
    }
}
