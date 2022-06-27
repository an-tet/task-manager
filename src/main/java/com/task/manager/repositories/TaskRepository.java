package com.task.manager.repositories;

import com.task.manager.models.Tasks;
import org.hibernate.type.BigDecimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, BigDecimalType> {
}
