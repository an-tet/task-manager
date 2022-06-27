package com.task.manager.repositories;

import com.task.manager.models.Files;
import org.hibernate.type.BigDecimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<Files, BigDecimalType> {
}
