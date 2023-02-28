package com.jpcchaves.cleanarch.config;

import com.jpcchaves.cleanarch.core.dataprovider.FindCustomerById;
import com.jpcchaves.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerById findCustomerById){
        return new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
