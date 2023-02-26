package com.jpcchaves.cleanarch.dataprovider;

import com.jpcchaves.cleanarch.core.dataprovider.FindCustomerById;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.dataprovider.mapper.CustomerEntityMapper;
import com.jpcchaves.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper entityMapper;
    @Override
    public Optional<Customer> find(Long id) {
        var customerEntity = customerRepository.findById(id);

        if(customerEntity.isEmpty()) {
            throw new RuntimeException("Customer not found");
        }

        return customerEntity.map(entity -> entityMapper.toCustomer(entity));
    }
}
