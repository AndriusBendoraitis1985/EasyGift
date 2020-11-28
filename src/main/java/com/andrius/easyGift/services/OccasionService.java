package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.models.Occasion;
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

    public void addInitialOccasionsData() {
        occasionRepository.save(compileDataOccasion1());
        occasionRepository.save(compileDataOccasion2());
        occasionRepository.save(compileDataOccasion3());
        occasionRepository.save(compileDataOccasion4());
        occasionRepository.save(compileDataOccasion5());
        occasionRepository.save(compileDataOccasion6());

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

    public Occasion editOccasion(Occasion occasion, Long occasionId) {
        occasion.setOccasionId(occasionId);
        return occasionRepository.save(occasion);
    }


    public Occasion compileDataOccasion1() {
        Occasion occasion = new Occasion(
                "Homer",
                "Simpson",
                "birthday",
                LocalDate.of(1985, 06, 21));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Cake",
                        "https://www.handletheheat.com/wp-content/uploads/2015/03/Best-Birthday-Cake-with-milk-chocolate-buttercream-SQUARE-550x550.jpg",
                        3,
                        occasion),
                new Gift(
                        "Ham",
                        "https://png.pngtree.com/png-clipart/20190920/original/pngtree-super-delicious-big-ham-png-image_4665908.jpg",
                        7,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion2() {
        Occasion occasion = new Occasion(
                "Marge",
                "Simpson",
                "weddings",
                LocalDate.of(2013, 07, 20));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Weekend in Paris",
                        "https://europe.stripes.com/sites/default/files/styles/community_site_carousel_750x500/public" +
                                "/article-images/53081031_s.jpg?itok=eHxRiJQK",
                        8,
                        occasion),
                new Gift(
                        "Visit in theatre",
                        "https://www.teatras.lt/uploads/img/catalog/13/image_13_79645224.jpg",
                        2,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion3() {
        Occasion occasion = new Occasion(
                "Bart",
                "Simpson",
                "birthday",
                LocalDate.of(2013, 11, 05));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Skate",
                        "https://image.made-in-china.com/202f0j00nKMtLWvrJUfY/China-Skate-Manufacturer-Mini-Longboard-Skateboards-for-Girls.jpg",
                        4,
                        occasion),
                new Gift(
                        "Bicycle",
                        "https://www.telegraph.co.uk/content/dam/health-fitness/2018/11/01" +
                                "/future_trans_NvBQzQNjv4BqztbJieiwAQnQRmGy6ktPKjGlvRPkLrU2fMgxYfCf0eU.jpg",
                        0,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion4() {
        Occasion occasion = new Occasion(
                "Lisa",
                "Simpson",
                "birthday",
                LocalDate.of(2015, 04, 12));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Saxophone",
                        "https://clipartion.com/wp-content/uploads/2015/11/lisa-saxophone-clipart.gif",
                        6,
                        occasion),
                new Gift(
                        "Book",
                        "https://ashmagautam.files.wordpress.com/2013/11/mcj038257400001.jpg",
                        1,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion5() {
        Occasion occasion = new Occasion(
                "Marge",
                "Simpson",
                "birthday",
                LocalDate.of(1987, 07, 29));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "Oven",
                        "https://ksd-images.lt/display/aikido/store/f1805a7435b9778e3d01849a32ab025d.jpg",
                        2,
                        occasion),
                new Gift(
                        "Perfume",
                        "https://i5.walmartimages.com/asr/b8a1e0f8-7154-4a69-af22-f53b9970f291_3.600ef75af25b4fadb9aca2a6f96454a0.jpeg",
                        1,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }

    public Occasion compileDataOccasion6() {
        Occasion occasion = new Occasion(
                "Marge",
                "Simpson",
                "Christmas",
                LocalDate.of(2020, 12, 24));

        List<Gift> gifts1 = Arrays.asList(
                new Gift(
                        "New car",
                        "https://tstoaddicts.files.wordpress.com/2015/04/canyonero-friendship-prize.png",
                        0,
                        occasion),
                new Gift(
                        "Dress",
                        "https://soondayswiss.files.wordpress.com/2013/12/soonday-08-m-simpson.jpg?w=650",
                        3,
                        occasion)
        );

        occasion.setGifts(gifts1);
        return occasion;
    }
}
