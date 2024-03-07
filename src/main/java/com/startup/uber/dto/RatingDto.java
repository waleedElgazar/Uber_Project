package com.startup.uber.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RatingDto extends BaseDto{

    private Long id;
    private CustomerDto customerDto;
    private DriverDto driverDto;
    private TripDto tripDto;
    private int rate;
    private String feedback;
}
