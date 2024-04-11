package tech.saintbassanaga.workerhr.dtos.specificRequest;

import tech.saintbassanaga.workerhr.dtos.embeded.LoginDto;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.Users}
 */
public record UsersLoginDto(LoginDto login) implements Serializable {
}