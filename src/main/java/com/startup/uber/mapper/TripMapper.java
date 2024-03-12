package com.startup.uber.mapper;

import com.startup.uber.dto.TripDto;
import com.startup.uber.entity.TripEntity;
import org.springframework.stereotype.Component;

@Component
public class TripMapper extends BaseMapper <TripEntity, TripDto> {
    @Override
    public Class<TripDto> getDtoClass() {
        return TripDto.class;
    }

    @Override
    public Class<TripEntity> getEntityClass() {
        return TripEntity.class;
    }
}
