package com.task.manager.models.users.properties;

import lombok.Getter;

public class Identifier {
    @Getter
    private final Long identifier;

    public Identifier(Long identifier) {
        // TODO: Validations here
        this.identifier = identifier;
    }
}
