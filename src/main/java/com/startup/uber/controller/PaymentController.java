package com.startup.uber.controller;

import com.startup.uber.dto.PaymentDto;
import com.startup.uber.service.PaymentService;
import com.startup.uber.service.PaymentServiceImpl;
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
    PaymentServiceImpl paymentService;


    @PostMapping("/add")
    public PaymentDto add(@RequestBody PaymentDto paymentDto){
        return getPaymentService().add(paymentDto);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody PaymentDto paymentDto){
        getPaymentService().delete(paymentDto);
    }
}
