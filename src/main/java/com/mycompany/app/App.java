package com.mycompany.app;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person(1L, "Isaias", "Gonzalez", "isaiasgonsales@gmail.com", 23, 1234567890, LocalDate.now());
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Last Name: " + person.getLastName());

        System.out.println("------------------------------------------------");
        Car car = Car.createCar("Toyota", "Corolla", 2020);
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());

        System.out.println("------------------------------------------------");
        Phone phone = new Phone("123-456-7890", "iPhone 13", "Apple");
        System.out.println(phone.model);
    }
}
