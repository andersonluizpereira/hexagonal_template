package com.comunidade.app.application.core.ports.in;

import com.comunidade.app.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
