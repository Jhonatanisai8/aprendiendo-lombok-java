package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor(staticName = "createCar") //nombre del metodo estatico para el constructor
@ToString(exclude = {"year"}) //excluir el atributo year del metodo toString
public class Car {
    private String make;
    private String model;
    private Integer year;
}
