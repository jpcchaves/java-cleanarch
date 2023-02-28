package com.jpcchaves.cleanarch.config;

import com.jpcchaves.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.jpcchaves.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.jpcchaves.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode, InsertCustomerImpl insertCustomerImpl) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomerImpl);
    }
}
