package com.startup.uber.controller;

import com.startup.uber.dto.PaymentDto;
import com.startup.uber.service.PaymentService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService paymentService;


    @PostMapping("/add")
    public PaymentDto add(@RequestBody PaymentDto paymentDto){
        return getPaymentService().add(paymentDto);
    }
}
