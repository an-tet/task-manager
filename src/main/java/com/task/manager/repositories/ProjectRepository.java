package com.task.manager.repositories;

import com.task.manager.models.Projects;
import org.hibernate.type.BigDecimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Projects, BigDecimalType> {
}
