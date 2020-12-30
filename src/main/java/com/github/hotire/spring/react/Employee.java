package com.github.hotire.spring.react;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String description;

    @Builder
    public Employee(final String firstName, final String lastName, final String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
