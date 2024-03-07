package com.startup.uber.dto;

import com.startup.uber.enums.PaymentMethodEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto extends BaseDto{
    private Long id;
    private PaymentMethodEnum paymentMethod;
    private double amount;
    private TripDto trip;
}
