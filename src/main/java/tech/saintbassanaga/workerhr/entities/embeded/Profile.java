package tech.saintbassanaga.workerhr.entities.embeded;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

}