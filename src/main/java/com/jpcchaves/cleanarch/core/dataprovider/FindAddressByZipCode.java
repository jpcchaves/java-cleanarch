package com.jpcchaves.cleanarch.core.dataprovider;

import com.jpcchaves.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
