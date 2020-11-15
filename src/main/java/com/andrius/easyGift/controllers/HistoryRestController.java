package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.HistoryEntry;
import com.andrius.easyGift.services.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HistoryRestController {

    private final HistoryService historyService;

    @GetMapping("/history")
    List<HistoryEntry> allHistoryEntries (){
        return historyService.getAllHistoryEntries();
    }

    @PostMapping("/history")
    HistoryEntry createdHistoryEntry(@RequestBody HistoryEntry historyEntry){
        return historyService.addHistoryEntry(historyEntry);
    }
}
