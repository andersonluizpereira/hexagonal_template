package com.comunidade.app.application.ports.in;

import com.comunidade.app.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
