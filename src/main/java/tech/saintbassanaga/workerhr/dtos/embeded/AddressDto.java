package tech.saintbassanaga.workerhr.dtos.embeded;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.embeded.Address}
 */
@Value
public class AddressDto implements Serializable {
    String firstAddress;
    String secondAddress;
    String thirdAddress;
    String country;
    String postalCode;
    String city;
    String state;
}