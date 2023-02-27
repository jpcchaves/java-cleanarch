package com.jpcchaves.cleanarch.core.usecase;

import com.jpcchaves.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
