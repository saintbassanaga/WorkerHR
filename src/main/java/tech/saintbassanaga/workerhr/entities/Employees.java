package tech.saintbassanaga.workerhr.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import tech.saintbassanaga.workerhr.entities.embeded.*;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users extends AbstractEntity {

    @Embedded
    private Login login;

    @Embedded
    private Preferences preferences;

    @Embedded
    private Address address;

    @Embedded
    private Profile profile;

    @Embedded
    private Work work;



}