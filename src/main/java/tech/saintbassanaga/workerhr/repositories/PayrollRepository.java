package tech.saintbassanaga.workerhr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.saintbassanaga.workerhr.entities.Payroll;

import java.util.UUID;

public interface PayrollRepository extends JpaRepository<Payroll, UUID> {
}