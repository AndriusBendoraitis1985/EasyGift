package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Gift;
import com.andrius.easyGift.repositories.GiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Service
public class GiftService {

    @Autowired
    private GiftRepository giftRepository;

    public List<Gift> getGiftsListSorted (){
        List<Gift> giftListSorted = giftRepository.findAll();
        giftListSorted.sort(Comparator.comparing(Gift::getRating).reversed());
        return giftListSorted;
    }

    public Gift saveGift (Gift gift){
        return giftRepository.save(gift);
    }
}
