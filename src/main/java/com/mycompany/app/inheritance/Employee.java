package com.mycompany.app.inheritance;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@ToString
public class Employee {
    String name;
    String lastName;
    String dni;
    LocalDate entryDate;
}
