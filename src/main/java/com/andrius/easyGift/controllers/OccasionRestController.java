package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.OccasionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OccasionRestController {

    private final OccasionRepository occasionRepository;

    @GetMapping("/events")
    List<Occasion> allOccasions() {
        return occasionRepository.findAll();
    }

    @PostMapping("/events")
    Occasion createdOccasion (@RequestBody Occasion occasion){
         return occasionRepository.save(occasion);
    }

}
