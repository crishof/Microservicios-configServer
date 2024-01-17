package com.tc.citiesservice.service;

import com.tc.citiesservice.dto.CityDTO;

public interface CityService {

    CityDTO getCitiesHotels(String name, String country);
}
