package com.comunidade.app.adapters.out.repository.mapper;

import com.comunidade.app.adapters.out.repository.entity.CustomerEntity;
import com.comunidade.app.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
