package com.jpcchaves.cleanarch.entrypoint.controller;

import com.jpcchaves.cleanarch.core.usecase.FindCustomerByIdUsecase;
import com.jpcchaves.cleanarch.core.usecase.InsertCustomerUsecase;
import com.jpcchaves.cleanarch.core.usecase.UpdateCustomerUseCase;
import com.jpcchaves.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.jpcchaves.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.jpcchaves.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUsecase insertCustomerUsecase;

    @Autowired
    private FindCustomerByIdUsecase findCustomerByIdUsecase;

    @Autowired
    private UpdateCustomerUseCase updateCustomerUsecase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUsecase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final Long id){
            var customer = findCustomerByIdUsecase.find(id);
            return ResponseEntity.ok(customerMapper.toCustomerResponse(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final Long id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerUsecase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }
}
