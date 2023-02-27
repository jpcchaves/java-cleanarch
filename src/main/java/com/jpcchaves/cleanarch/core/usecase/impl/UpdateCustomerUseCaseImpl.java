package com.jpcchaves.cleanarch.core.usecase.impl;

import com.jpcchaves.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.jpcchaves.cleanarch.core.dataprovider.UpdateCustomer;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.core.usecase.FindCustomerByIdUsecase;
import com.jpcchaves.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

    private final FindCustomerByIdUsecase findCustomerByIdUsecase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUseCaseImpl(FindCustomerByIdUsecase findCustomerByIdUsecase, FindAddressByZipCode findAddressByZipCode, UpdateCustomer updateCustomer) {
        this.findCustomerByIdUsecase = findCustomerByIdUsecase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        var customerEntity = findCustomerByIdUsecase.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);

        customer.setAddress(address);

        updateCustomer.update(customerEntity);
    }
}
