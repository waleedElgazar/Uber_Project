package com.startup.uber.mapper;


import com.startup.uber.dto.BaseDto;
import com.startup.uber.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
public class BaseMapper<E extends BaseEntity, D extends BaseDto> {

    private ModelMapper modelMapper;

    public E convertToEntity(D dto, Class<? extends BaseEntity> entity) {
        if (null == dto) {
            return null;
        }
        return (E) this.getModelMapper().map(dto, entity);
    }

    public D convertToDto(E entity, Class<? extends BaseDto> dto) {
        if (null == entity) {
            return null;
        }
        return (D) this.getModelMapper().map(entity, dto);
    }

    public List<D> convertListEntityToDto(List<E> entityList, D dto) {
        List<D> dtoList = new ArrayList<>();
        for (E entity : entityList) {
            dtoList.add(convertToDto(entity, dto.getClass()));
        }
        return dtoList;
    }

    public List<E> convertListDtoToEntity(List<D> dtoList, E entity) {
        List<E> entityList = new ArrayList<>();
        for (D dto : dtoList) {
            entityList.add(convertToEntity(dto, entity.getClass()));
        }
        return entityList;
    }


}
