package com.comunidade.app.application.core.ports.in;

import com.comunidade.app.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
