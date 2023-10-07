package com.comunidade.app.application.core.ports.out;

import com.comunidade.app.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
