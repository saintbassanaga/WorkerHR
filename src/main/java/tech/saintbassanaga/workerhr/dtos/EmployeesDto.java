package tech.saintbassanaga.workerhr.dtos;

import lombok.Value;
import tech.saintbassanaga.workerhr.dtos.embeded.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.Employees}
 */
@Value
public class EmployeesDto implements Serializable {
    UUID id;
    Instant createdDate;
    Instant lastModifiedDate;
    LoginDto login;
    PreferencesDto preferences;
    AddressDto address;
    ProfileDto profile;
    WorkDto work;
}