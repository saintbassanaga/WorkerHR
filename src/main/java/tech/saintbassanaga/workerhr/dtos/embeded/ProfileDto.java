package tech.saintbassanaga.workerhr.dtos.embeded;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.embeded.Profile}
 */
@Value
public class ProfileDto implements Serializable {
    String name;
    String surname;
    String age;
    String iceColors;
}