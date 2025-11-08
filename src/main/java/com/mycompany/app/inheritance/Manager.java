package com.mycompany.app.inheritance;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true) // incluir los atributos de la clase padre en el metodo toString
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@NoArgsConstructor
public class Manager extends Employee {
    Double annualBonus;
    Integer teamInCharge;
}
