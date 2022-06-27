package com.task.manager.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.type.BigDecimalType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private BigDecimalType id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String priority;
    @Getter @Setter
    private String description;
    @Getter @Setter
    private LocalDateTime dead_line;
    @Getter @Setter
    private Boolean status;
}