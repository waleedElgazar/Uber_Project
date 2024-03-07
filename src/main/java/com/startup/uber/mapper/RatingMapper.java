package com.startup.uber.mapper;

import com.startup.uber.dto.RatingDto;
import com.startup.uber.entity.RatingEntity;
import org.springframework.stereotype.Component;

@Component
public class RatingMapper extends BaseMapper<RatingEntity , RatingDto> {
    @Override
    public Class<RatingDto> getDtoClass() {
        return RatingDto.class;
    }

    @Override
    public Class<RatingEntity> getEntityClass() {
        return RatingEntity.class;
    }
}
