package com.andrius.easyGift.services;

import com.andrius.easyGift.models.HistoryEntry;
import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<HistoryEntry> getAllHistoryEntries() {
        return historyRepository.findAll();
    }

    public HistoryEntry addHistoryEntry (HistoryEntry historyEntry){
        return historyRepository.save(historyEntry);
    }

    public void addInitialHistoryData() {
        HistoryEntry historyEntry1 = new HistoryEntry(
                "Homer",
                "Simpson",
                "birthday",
                LocalDate.of(2019, 06, 20),
                "Hammock",
                "https://images1.novica.net/pictures/2/p176824_2a.jpg");
        HistoryEntry historyEntry2 = new HistoryEntry(
                "Lisa",
                "Simpson",
                "Christmas",
                LocalDate.of(2019, 04, 24),
                "Hat",
                "https://4wayz.co.uk/wp-content/uploads/2019/01/c8f03132-e2c3-4df7-89cf-d5679b78869d.jpg");

        historyRepository.save(historyEntry1);
        historyRepository.save(historyEntry2);
    }


}
