package com.comunidade.app.application.core.ports.out;

import com.comunidade.app.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
