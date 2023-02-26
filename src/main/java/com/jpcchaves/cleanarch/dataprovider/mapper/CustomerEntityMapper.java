package com.jpcchaves.cleanarch.dataprovider.mapper;

import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring"
)
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
