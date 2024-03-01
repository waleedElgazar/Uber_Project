package com.startup.uber;

import com.startup.uber.dto.PaymentDto;
import com.startup.uber.dto.TripDto;
import com.startup.uber.entity.BaseEntity;
import com.startup.uber.entity.PaymentEntity;
import com.startup.uber.enums.PaymentMethodEnum;
import com.startup.uber.mapper.BaseMapper;
import com.startup.uber.repo.PaymentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class UberApplicationTests {

//    @Autowired
    BaseMapper baseMapper = new BaseMapper();
    PaymentRepo paymentRepo;
    @Test
    void contextLoads() {

        paymentRepo.findAll();


        PaymentDto paymentDto = new PaymentDto(1l, PaymentMethodEnum.CARD, 12d, new TripDto());
        BaseEntity baseEntity = baseMapper.convertToEntity(paymentDto, PaymentEntity.class);
        System.out.println(baseEntity.toString());
    }

}
