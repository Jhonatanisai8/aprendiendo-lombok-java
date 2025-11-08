package com.mycompany.app;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString(of = {"model"}) // solo incluir el atributo model en el metodo toString
@Builder // generar el patron de diseno builder para crear objetos de la clase Phone
public class Phone {
    String number;
    public String model;//sera de acceso publico y no privado
    String brand;
}
