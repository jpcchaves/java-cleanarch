package com.jpcchaves.cleanarch.dataprovider;

import com.jpcchaves.cleanarch.core.dataprovider.InsertCustomer;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.dataprovider.mapper.CustomerEntityMapper;
import com.jpcchaves.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
      customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
