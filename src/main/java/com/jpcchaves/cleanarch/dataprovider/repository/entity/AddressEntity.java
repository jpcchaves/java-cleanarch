package com.jpcchaves.cleanarch.dataprovider.repository.entity;

import java.util.Objects;

public class AddressEntity {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return street.equals(that.street) && city.equals(that.city) && state.equals(that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state);
    }
}
