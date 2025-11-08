package com.mycompany.app;

import lombok.*;

import java.time.LocalDate;

@Setter(value = AccessLevel.PUBLIC)
@Getter(value = AccessLevel.PUBLIC)
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(of = {"id", "name"}) //generar los metodos equals y hashCode basados en id y name
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
