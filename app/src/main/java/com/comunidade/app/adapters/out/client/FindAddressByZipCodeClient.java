package com.comunidade.app.adapters.out.client;

import com.comunidade.app.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${via_cep.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}/json")
    AddressResponse find(@PathVariable("zipCode") String zipCode);

}
