package com.tc.citiesservice.controller;

import com.tc.citiesservice.dto.CityDTO;
import com.tc.citiesservice.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CItyController {

    @Autowired
    private CityService cityService;

    @GetMapping("/hotels")
    public CityDTO getCityAndHotels(@RequestParam String name, @RequestParam String country) {
        return cityService.getCitiesHotels(name, country);
    }
}
