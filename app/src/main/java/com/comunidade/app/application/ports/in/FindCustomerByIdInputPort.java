package com.comunidade.app.application.ports.in;

import com.comunidade.app.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
