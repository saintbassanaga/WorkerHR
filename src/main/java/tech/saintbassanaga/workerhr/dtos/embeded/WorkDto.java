package tech.saintbassanaga.workerhr.dtos.embeded;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link tech.saintbassanaga.workerhr.entities.embeded.Work}
 */
@Value
public class WorkDto implements Serializable {
    String title;
    String description;
    String salary;
    String startDate;
    String endDate;
    String status;
    String location;
}