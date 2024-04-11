package tech.saintbassanaga.workerhr.dtos;

import lombok.Value;
import tech.saintbassanaga.workerhr.dtos.embeded.ProfileDto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.Payroll}
 */
@Value
public class PayrollDto implements Serializable {
    UUID id;
    EmployeesPayrollDto employee;
    BigDecimal salary;
    BigDecimal bonus;
    BigDecimal deduction;
    LocalDate paymentDate;

    /**
     * DTO for {@link tech.saintbassanaga.workerhr.entities.Employees}
     */
    @Value
    public static class EmployeesPayrollDto implements Serializable {
        ProfileDto profile;
    }
}