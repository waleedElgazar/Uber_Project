package com.startup.uber.mapper;

import com.startup.uber.dto.CustomerDto;
import com.startup.uber.entity.CustomerEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper extends BaseMapper<CustomerEntity , CustomerDto>{
    @Override
    public Class<CustomerDto> getDtoClass() {
        return CustomerDto.class;
    }

    @Override
    public Class<CustomerEntity> getEntityClass() {
        return CustomerEntity.class;
    }
}
