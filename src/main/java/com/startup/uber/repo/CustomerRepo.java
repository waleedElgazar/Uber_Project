package com.startup.uber.repo;

import com.startup.uber.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends BaseRepo<CustomerEntity> {
}
