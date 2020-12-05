package com.andrius.easyGift.services;

import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.OccasionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardService {

    @Autowired
    private OccasionRepository occasionRepository;

    public List<Occasion> getAllOccasionsForMonthPeriod() {
        List<Occasion> listOccasionsSortedByDate = occasionRepository.findAll();
        listOccasionsSortedByDate.sort(Comparator.comparing(Occasion::getOccasionDate));
        List <Occasion> listOccasionsSortedByDateForOneMonthPeriod = listOccasionsSortedByDate.stream()
                .filter(element -> element.getOccasionDate().isBefore(LocalDate.now().plusDays(30)))
                .collect(Collectors.toList());
        return listOccasionsSortedByDateForOneMonthPeriod;
    }

    public List<Occasion> getOccasionsOfAuthorisedUser(String userName) {
        System.out.println(userName);
        return occasionRepository.findAllByUserName(userName);
    }


}
