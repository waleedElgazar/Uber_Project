package com.startup.uber.service;

import com.startup.uber.dto.PaymentDto;
import com.startup.uber.entity.PaymentEntity;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.mapper.PaymentMapper;
import com.startup.uber.repo.BaseRepo;
import com.startup.uber.repo.PaymentRepo;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class PaymentServiceImpl extends BaseService <PaymentEntity, PaymentDto> {

    @Autowired
    private PaymentRepo paymentRepo;
    @Autowired
    PaymentMapper paymentMapper;

    @Override
    public BaseRepo getRepo() {
        return paymentRepo;
    }

    @Override
    public PaymentMapper getMapper() {
        return paymentMapper;
    }
}
