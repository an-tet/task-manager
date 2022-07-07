package com.task.manager.models.users.properties;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LastName {
    @Getter
    @Setter
    @NotNull
    @NotEmpty
    // TODO: ask if this is the best way for this
    @Pattern(regexp = "[a-zA-z]+([ '-][a-zA-Z]+)*")
    @Size(min = 3, max = 30)

    private String lastName;

    public LastName(String lastName) {
        this.lastName = lastName;
    }
}
