package com.jpcchaves.cleanarch.core.usecase.impl;

import com.jpcchaves.cleanarch.core.dataprovider.DeleteCustomer;
import com.jpcchaves.cleanarch.core.dataprovider.FindCustomerById;
import com.jpcchaves.cleanarch.core.usecase.DeleteCustomerUsecase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerUsecase {

    private final FindCustomerById findCustomerById;
    private final DeleteCustomer deleteCustomer;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerById findCustomerById, DeleteCustomer deleteCustomer) {
        this.findCustomerById = findCustomerById;
        this.deleteCustomer = deleteCustomer;
    }
    @Override
    public void delete(Long id) {
        findCustomerById.find(id);
        deleteCustomer.delete(id);
    }
}
