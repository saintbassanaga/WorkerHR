package tech.saintbassanaga.workerhr.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

}