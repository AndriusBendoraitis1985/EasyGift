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
@RequestMapping("/events")
public class OccasionRestController {

    private final OccasionService occasionService;
    private final OccasionRepository occasionRepository;
    private final GiftRepository giftRepository;

    @GetMapping()
    List<Occasion> allOccasions() {
        return occasionService.getAllOccasions();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/new")
    Occasion createdOccasion(@RequestBody Occasion occasion) {
        return occasionService.addOccasion(occasion);
    }

    @GetMapping("/{id}")
    Occasion occasionById(@PathVariable Long id) {
        return occasionService.getOccasionById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id) {
        occasionService.deleteOccasionById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/{occasionId}/new")
    Occasion addNewGift (@RequestBody Gift gift, @PathVariable Long occasionId){
        return occasionService.addNewGift(gift, occasionId);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{occasionId}/edit")
    Occasion editOccasion (@RequestBody Occasion occasion, @PathVariable Long occasionId){
        return occasionService.editOccasion(occasion, occasionId);
    }
}
