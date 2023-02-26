package com.jpcchaves.cleanarch.core.usecase.impl;

import com.jpcchaves.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.jpcchaves.cleanarch.core.dataprovider.InsertCustomer;
import com.jpcchaves.cleanarch.core.domain.Customer;
import com.jpcchaves.cleanarch.core.usecase.InsertCustomerUsecase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUsecase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);

        insertCustomer.insert(customer);
    }
}
