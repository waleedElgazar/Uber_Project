package com.startup.uber.controller;

import com.startup.uber.dto.CustomerDto;
import com.startup.uber.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/add")
    public CustomerDto add(@RequestBody CustomerDto customerDto) {
        return customerService.add(customerDto);
    }

}
