package com.tc.citiesservice.repository;

import com.tc.citiesservice.dto.HotelDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "hotels-service")
public interface HotelsAPI {

    @GetMapping("hotels/{city_id}")
    List<HotelDTO> getHotelsByCityId(@PathVariable("city_id") Long city_id);
}
