package tech.saintbassanaga.workerhr.dtos;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.embeded.Login}
 */
public record LoginDto(String username, String password, String accessToken) implements Serializable {
}