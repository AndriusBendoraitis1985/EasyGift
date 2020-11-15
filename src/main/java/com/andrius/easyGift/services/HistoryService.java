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
                "Kamile",
                "Bendoraityte",
                "birthday",
                LocalDate.of(2016, 06, 16),
                "doll",
                "https://images-na.ssl-images-amazon.com/images/I/714yfUZN8WL._SY879_.jpg");
        HistoryEntry historyEntry2 = new HistoryEntry(
                "Aleksandr",
                "Cerniuk",
                "christmas",
                LocalDate.of(2019, 12, 24),
                "workshop tools",
                "https://cdn.goodao.net/jjfixman/145.jpg");

        historyRepository.save(historyEntry1);
        historyRepository.save(historyEntry2);
    }


}
