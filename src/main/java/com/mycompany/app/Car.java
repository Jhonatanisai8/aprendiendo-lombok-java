package com.mycompany.app;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(staticName = "createCar") //nombre del metodo estatico para el constructor
@ToString(exclude = {"year"}) //excluir el atributo year del metodo toString
@EqualsAndHashCode(exclude = {"model"}) //generar los metodos equals y hashCode que sirven para comparar objetos
public class Car {
    private String make;
    private String model;
    private Integer year;
}
