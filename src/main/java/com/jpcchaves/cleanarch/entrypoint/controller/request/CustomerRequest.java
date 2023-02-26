package com.jpcchaves.cleanarch.entrypoint.controller.request;

import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

public class CustomerRequest {

    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerRequest that = (CustomerRequest) o;
        return name.equals(that.name) && cpf.equals(that.cpf) && zipCode.equals(that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, zipCode);
    }
}
