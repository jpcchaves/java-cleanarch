package com.jpcchaves.cleanarch.dataprovider.repository;

import com.jpcchaves.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
