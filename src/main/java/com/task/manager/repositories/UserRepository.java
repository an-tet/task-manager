package com.task.manager.repositories;

import com.task.manager.models.Users;
import org.hibernate.type.BigDecimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, BigDecimalType> {
}
