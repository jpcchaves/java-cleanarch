package com.jpcchaves.cleanarch.core.dataprovider;

import com.jpcchaves.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final Long id);
}
