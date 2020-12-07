package com.andrius.easyGift.services;

import com.andrius.easyGift.models.HistoryEntry;
import com.andrius.easyGift.repositories.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<HistoryEntry> getHistoryEntriesByResponsiblePerson (String username){
        return historyRepository.findAllByUser_UserName(username);
    }

}
