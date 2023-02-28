package com.jpcchaves.cleanarch.config;

import com.jpcchaves.cleanarch.core.dataprovider.DeleteCustomer;
import com.jpcchaves.cleanarch.core.dataprovider.FindCustomerById;
import com.jpcchaves.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(
            FindCustomerById findCustomerById,
            DeleteCustomer deleteCustomer
    ) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerById, deleteCustomer);
    }

}
