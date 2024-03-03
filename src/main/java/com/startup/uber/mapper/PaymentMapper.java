package com.startup.uber.mapper;

import com.startup.uber.dto.PaymentDto;
import com.startup.uber.entity.PaymentEntity;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper extends BaseMapper<PaymentEntity, PaymentDto> {
    @Override
    public Class<PaymentDto> getDtoClass() {
        return PaymentDto.class;
    }

    @Override
    public Class<PaymentEntity> getEntityClass() {
        return PaymentEntity.class;
    }
}
