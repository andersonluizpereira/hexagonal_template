package com.comunidade.app.adapters.out.repository;

import com.comunidade.app.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends
        CrudRepository<CustomerEntity, String> {
}
