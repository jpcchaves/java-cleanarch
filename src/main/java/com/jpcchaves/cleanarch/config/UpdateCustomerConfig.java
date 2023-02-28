package com.jpcchaves.cleanarch.config;

import com.jpcchaves.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.jpcchaves.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.jpcchaves.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.jpcchaves.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUsecase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUsecase, findAddressByZipCode, updateCustomer);
    }
}
