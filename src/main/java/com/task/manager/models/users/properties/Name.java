package com.task.manager.models.users.properties;

import lombok.Getter;
import lombok.Setter;

public class Name {
    @Getter @Setter
    private String name;

    public Name(String name) {
        //TODO: Validate here
        this.name = name;
    }
}
