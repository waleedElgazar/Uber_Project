package com.startup.uber.controller;

import com.startup.uber.dto.TripDto;
import com.startup.uber.service.TripService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    TripService tripService;

    @PostMapping("/add")
    public TripDto add(@RequestBody TripDto tripDto) {
        return getTripService().add(tripDto);
    }
}
