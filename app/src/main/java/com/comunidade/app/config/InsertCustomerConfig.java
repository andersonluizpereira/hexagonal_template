package com.comunidade.app.config;

import com.comunidade.app.adapters.out.FindAddressByZipCodeAdapter;
import com.comunidade.app.adapters.out.InsertCustomerAdapter;
import com.comunidade.app.adapters.out.SendCpfForValidationAdapter;
import com.comunidade.app.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
