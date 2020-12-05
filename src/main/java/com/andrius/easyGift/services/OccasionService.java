package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.OccasionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OccasionService {

    @Autowired
    private OccasionRepository occasionRepository;


    public List<Occasion> getAllOccasions() {
        List<Occasion> listOccasionsSortedByDate = occasionRepository.findAll();
        listOccasionsSortedByDate.sort(Comparator.comparing(Occasion::getOccasionDate));
        return listOccasionsSortedByDate;
    }

    public Occasion addOccasion(Occasion occasion) {
        return occasionRepository.save(occasion);
    }

    public Occasion getOccasionById(Long id) throws IllegalArgumentException {
        return occasionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("event with id" + id +
                "not found"));
    }

    public void deleteOccasionById(Long id) {
        occasionRepository.deleteById(id);
    }

    public Occasion addNewGift(Gift gift, Long id) {

        Occasion occasionToChange = getOccasionById(id);
        gift.setOccasion(occasionToChange);
        List<Gift> giftListToChange = occasionToChange.getGifts();
        giftListToChange.add(gift);
        occasionToChange.setGifts(giftListToChange);

        return occasionRepository.save(occasionToChange);
    }

    public Occasion editOccasion(Occasion occasion, Long occasionId) {
        occasion.setOccasionId(occasionId);
        return occasionRepository.save(occasion);
    }
}
