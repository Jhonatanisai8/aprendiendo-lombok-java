package com.mycompany.app;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
public class Person {

    //@Setter
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Integer age;
    private Integer phoneNumber;
    private LocalDate dateOfBirth;
}
