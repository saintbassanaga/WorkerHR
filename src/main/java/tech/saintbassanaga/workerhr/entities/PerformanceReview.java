package tech.saintbassanaga.workerhr.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "performance_review")
public class PerformanceReview extends AbstractEntity {
}