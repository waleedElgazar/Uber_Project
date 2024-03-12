package com.startup.uber.service;

import com.startup.uber.dto.TripDto;
import com.startup.uber.entity.TripEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.mapper.TripMapper;
import com.startup.uber.repo.BaseRepo;
import com.startup.uber.repo.TripRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter @Setter
@Service
public class TripService extends BaseService<TripEntity, TripDto> {
    @Autowired
    TripRepo tripRepo;
    @Autowired
    TripMapper tripMapper;
    @Override
    public BaseRepo getRepo() {
        return tripRepo;
    }

    @Override
    public BaseMapper getMapper() {
        return tripMapper;
    }
}
