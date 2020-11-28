package com.andrius.easyGift;

import com.andrius.easyGift.services.HistoryService;
import com.andrius.easyGift.services.OccasionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EasyGiftApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EasyGiftApplication.class, args);
    }

    @Autowired
    private OccasionService occasionService;

    @Autowired
    private HistoryService historyService;

    @Override
    public void run(String... args) throws Exception {
//        occasionService.addInitialOccasionsData();
//        historyService.addInitialHistoryData();
    }
}
