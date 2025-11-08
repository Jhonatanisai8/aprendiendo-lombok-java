package com.mycompany.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(of = {"model"}) // solo incluir el atributo model en el metodo toString
public class Phone {
    String number;
    public String model;//sera de acceso publico y no privado
    String brand;
}
