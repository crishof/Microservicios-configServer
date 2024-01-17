package com.tc.citiesservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    private Long city_id;
    private String name;
    private String continent;
    private String country;
    private String state;
}
