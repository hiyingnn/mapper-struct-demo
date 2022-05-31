package com.example.demo;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String firstName;
    private String lastName;
    private PersonType personType;
    private int age;
    private String identificationNo;
}

enum PersonType {
    SCHOLAR
}
