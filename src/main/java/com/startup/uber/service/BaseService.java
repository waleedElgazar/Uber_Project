package com.startup.uber.service;

import com.startup.uber.dto.BaseDto;
import com.startup.uber.entity.BaseEntity;
import com.startup.uber.entity.PaymentEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.repo.BaseRepo;

public abstract class BaseService<E extends BaseEntity, D extends BaseDto> {

    public D add(D dtoObject) {
        E baseEntity = (E) getMapper().convertToEntity(dtoObject);
        E savedEntity = (E) getRepo().save(baseEntity);
        D baseDto = (D) getMapper().convertToDto(savedEntity);
        return baseDto;
    }

    public void delete(D dtoObject) {
        E baseEntity = (E) getMapper().convertToEntity(dtoObject);
        getRepo().delete(baseEntity);`
    }

    public abstract BaseRepo getRepo();

    public abstract BaseMapper getMapper();
}
