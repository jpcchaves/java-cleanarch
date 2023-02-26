package com.jpcchaves.cleanarch.core.usecase;

import com.jpcchaves.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUsecase {
    Customer find(Long id);
}
