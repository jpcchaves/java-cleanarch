package com.jpcchaves.cleanarch.core.usecase.impl;

import com.jpcchaves.cleanarch.core.dataprovider.FindCustomerById;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.core.usecase.FindCustomerByIdUsecase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUsecase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(Long id) {
        return findCustomerById
                .find(id)
                .orElseThrow(() -> new RuntimeException("Could not find customer"));
    }
}
