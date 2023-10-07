package com.comunidade.app.adapters.out.client.mapper;

import com.comunidade.app.adapters.out.client.response.AddressResponse;
import com.comunidade.app.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
