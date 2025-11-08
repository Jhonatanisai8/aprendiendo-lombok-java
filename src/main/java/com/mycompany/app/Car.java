package com.mycompany.app;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(staticName = "createCar") //nombre del metodo estatico para el constructor
public class Car {
    private String make;
    private String model;
    private Integer year;
}
