package com.comunidade.app.application.ports.out;

import com.comunidade.app.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
