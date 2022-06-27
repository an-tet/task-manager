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

@AllArgsConstructor
@NoArgsConstructor
public class Files {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private BigDecimalType id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String path;
    @Getter @Setter
    private LocalDateTime created_date;
    @Getter @Setter
    private String extension;
}
