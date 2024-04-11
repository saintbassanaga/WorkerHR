package tech.saintbassanaga.workerhr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.saintbassanaga.workerhr.entities.Employees;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface UsersRepository extends JpaRepository<Employees, UUID> {
    Optional<Employees> findUsersByAddress_FirstAddress(String address);
    Optional<Employees> findUsersByProfile_Name(String name);
}