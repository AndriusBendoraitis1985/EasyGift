package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.GiftRepository;
import com.andrius.easyGift.repositories.OccasionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class OccasionService {

    @Autowired
    private OccasionRepository occasionRepository;

    @Autowired
    private GiftRepository giftRepository;

    public void addInitialOccasionsData() {
        occasionRepository.save(compileDataOccasion1());
        occasionRepository.save(compileDataOccasion2());
    }

    public List<Occasion> getAllOccasions() {
        return occasionRepository.findAll();
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


    public Occasion compileDataOccasion1() {
        Occasion occasion = new Occasion(
                "Andrius",
                "Bendoraitis",
                "birthday",
                LocalDate.of(1985, 06, 21));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Motorcycling gloves",
                        "https://dainese-cdn.thron.com/delivery/public/image/dainese/03183936-2923-46e0-9744" +
                                "-6ddf6151a43a/ramfdh/std/615x615/steel-pro-gloves.jpg",
                        0,
                        occasion),
                new Gift(
                        "Hand watch",
                        "https://images-na.ssl-images-amazon.com/images/I/51nufe1j92L._AC_UX679_.jpg",
                        0,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion2() {
        Occasion occasion = new Occasion(
                "Elvyra",
                "Bendoraitiene",
                "weddings",
                LocalDate.of(2013, 07, 20));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Weekend in Paris",
                        "https://europe.stripes.com/sites/default/files/styles/community_site_carousel_750x500/public" +
                                "/article-images/53081031_s.jpg?itok=eHxRiJQK",
                        0,
                        occasion),
                new Gift(
                        "Visit in theatre",
                        "https://www.teatras.lt/uploads/img/catalog/13/image_13_79645224.jpg",
                        0,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }
}
