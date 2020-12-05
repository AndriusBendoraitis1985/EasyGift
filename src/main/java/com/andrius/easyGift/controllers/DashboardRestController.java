package com.andrius.easyGift.controllers;

import com.andrius.easyGift.models.Occasion;
import com.andrius.easyGift.services.DashboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dashboard")
public class DashboardRestController {

    private final DashboardService dashboardService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/month")
    List<Occasion> occasionsForMonthPeriod() {
        return dashboardService.getAllOccasionsForMonthPeriod();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/byUser/{userName}")
    List<Occasion> occasionsOfAuthorisedUser(@PathVariable String userName) {
        return dashboardService.getOccasionsOfAuthorisedUser(userName);
    }
}
