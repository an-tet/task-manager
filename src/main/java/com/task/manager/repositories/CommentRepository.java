package com.task.manager.repositories;

import com.task.manager.models.Comments;
import org.hibernate.type.BigDecimalType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, BigDecimalType> {
}
