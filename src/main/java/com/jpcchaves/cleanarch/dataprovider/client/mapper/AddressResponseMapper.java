package com.jpcchaves.cleanarch.dataprovider.client.mapper;

import com.jpcchaves.cleanarch.core.domain.Address;
import com.jpcchaves.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
