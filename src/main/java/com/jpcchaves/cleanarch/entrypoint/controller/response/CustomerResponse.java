package com.jpcchaves.cleanarch.entrypoint.controller.response;

import java.util.Objects;

public class CustomerResponse {
    private String name;
    private String cpf;
    private Boolean isValidCpf;
    private AddressResponse address;

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

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerResponse that = (CustomerResponse) o;
        return name.equals(that.name) && cpf.equals(that.cpf) && isValidCpf.equals(that.isValidCpf) && address.equals(that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, isValidCpf, address);
    }
}
