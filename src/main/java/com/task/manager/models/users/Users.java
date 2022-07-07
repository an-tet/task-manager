package com.task.manager.models.users;

import com.task.manager.models.users.properties.LastName;
import com.task.manager.models.users.properties.Name;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import com.task.manager.models.users.properties.Identifier;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //TODO: its correct?
    @Column(name = "id", nullable = false, unique = true)
    private Identifier id;
    private Name name;
    private LastName last_name;
    private String email;
    private String password;
    private String provider;
    private Boolean status;
    private LocalDateTime created_at;
    private LocalDateTime last_login;
}
