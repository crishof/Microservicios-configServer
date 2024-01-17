package com.tc.hotelsservice.service;

import com.tc.hotelsservice.model.Hotel;

import java.util.List;

public interface HotelService {

    List<Hotel> getHotelsByCityId(Long city_id);
}
