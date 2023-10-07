package com.comunidade.app.adapters.out;

import com.comunidade.app.adapters.out.client.FindAddressByZipCodeClient;
import com.comunidade.app.adapters.out.client.mapper.AddressResponseMapper;
import com.comunidade.app.application.core.domain.Address;
import com.comunidade.app.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
