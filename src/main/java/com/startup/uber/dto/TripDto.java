package com.startup.uber.dto;

import com.startup.uber.entity.CustomerEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class TripDto extends BaseDto{
    private Long id;
//todo waleed update this to dto
    private CustomerEntity customer;
    private CustomerEntity driver;
    private PaymentDto payment;


}
