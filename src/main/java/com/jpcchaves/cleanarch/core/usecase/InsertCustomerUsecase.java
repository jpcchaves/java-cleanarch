package com.jpcchaves.cleanarch.core.usecase;

import com.jpcchaves.cleanarch.core.domain.Customer;

public interface InsertCustomerUsecase {

    void insert(Customer customer, String zipcode);

}
