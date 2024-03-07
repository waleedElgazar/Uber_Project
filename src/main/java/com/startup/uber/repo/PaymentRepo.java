package com.startup.uber.repo;

import com.startup.uber.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends BaseRepo<PaymentEntity> {
}
