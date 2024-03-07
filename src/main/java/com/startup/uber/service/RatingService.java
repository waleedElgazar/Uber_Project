package com.startup.uber.service;

import com.startup.uber.dto.RatingDto;
import com.startup.uber.dto.TripDto;
import com.startup.uber.entity.RatingEntity;
import com.startup.uber.entity.TripEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.mapper.RatingMapper;
import com.startup.uber.repo.BaseRepo;
import com.startup.uber.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService extends BaseService<RatingEntity, RatingDto> {

    @Autowired
    private RatingRepo ratingRepo;

    @Autowired
    private RatingMapper ratingMapper;

    @Override
    public BaseRepo getRepo() {
        return ratingRepo;
    }

    @Override
    public BaseMapper getMapper() {
        return ratingMapper;
    }
}
