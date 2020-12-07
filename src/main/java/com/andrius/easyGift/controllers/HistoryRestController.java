package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.HistoryEntry;
import com.andrius.easyGift.services.HistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HistoryRestController {

    private final HistoryService historyService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/history")
    List<HistoryEntry> allHistoryEntries (){
        return historyService.getAllHistoryEntries();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/history")
    HistoryEntry createdHistoryEntry(@RequestBody HistoryEntry historyEntry){
        return historyService.addHistoryEntry(historyEntry);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/history/{userName}")
    List<HistoryEntry> allHistoryEntries (@PathVariable String userName){
        return historyService.getHistoryEntriesByResponsiblePerson(userName);
    }
}
