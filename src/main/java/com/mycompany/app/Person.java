package com.mycompany.app;

import lombok.*;

import java.time.LocalDate;

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
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
