package com.comunidade.app.adapters.out.repository.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@Builder
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private AddressEntity address;

    private String cpf;

    private Boolean isValidCpf;

}
