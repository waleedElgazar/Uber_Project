package com.startup.uber.service;

import com.startup.uber.dto.CustomerDto;
import com.startup.uber.entity.CustomerEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.mapper.CustomerMapper;
import com.startup.uber.repo.BaseRepo;
import com.startup.uber.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends BaseService<CustomerEntity, CustomerDto>{

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public BaseRepo getRepo() {
        return customerRepo;
    }

    @Override
    public BaseMapper getMapper() {
        return customerMapper;
    }
}
