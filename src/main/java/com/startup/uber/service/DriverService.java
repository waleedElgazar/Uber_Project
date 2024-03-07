package com.startup.uber.service;

import com.startup.uber.dto.CustomerDto;
import com.startup.uber.entity.CustomerEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.mapper.CustomerMapper;
import com.startup.uber.mapper.DriverMapper;
import com.startup.uber.repo.BaseRepo;
import com.startup.uber.repo.CustomerRepo;
import com.startup.uber.repo.DriverRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService extends BaseService<CustomerEntity , CustomerDto>{

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private DriverMapper driverMapper;

    @Override
    public BaseRepo getRepo() {
        return driverRepo;
    }

    @Override
    public BaseMapper getMapper() {
        return driverMapper;
    }
}
