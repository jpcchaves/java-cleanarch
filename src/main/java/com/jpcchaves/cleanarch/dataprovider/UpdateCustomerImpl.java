package com.jpcchaves.cleanarch.dataprovider;

import com.jpcchaves.cleanarch.core.dataprovider.UpdateCustomer;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.dataprovider.mapper.CustomerEntityMapper;
import com.jpcchaves.cleanarch.dataprovider.repository.CustomerRepository;
import com.jpcchaves.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
