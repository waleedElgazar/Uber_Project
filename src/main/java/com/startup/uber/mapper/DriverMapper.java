package com.startup.uber.mapper;

import com.startup.uber.dto.BaseDto;
import com.startup.uber.dto.DriverDto;
import com.startup.uber.entity.DriverEntity;
import org.springframework.stereotype.Component;

@Component
public class DriverMapper extends BaseMapper<DriverEntity , DriverDto>{
    @Override
    public Class<DriverDto> getDtoClass() {
        return DriverDto.class;
    }

    @Override
    public Class<DriverEntity> getEntityClass() {
        return DriverEntity.class;
    }
}
