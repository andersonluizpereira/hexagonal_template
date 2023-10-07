package com.comunidade.app.application.core.ports.out;

import com.comunidade.app.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipcode);
}
