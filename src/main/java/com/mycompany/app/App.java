package com.mycompany.app;

import lombok.extern.java.Log;

import java.time.LocalDate;

@Log
public class App {
    public static void main(String[] args) {
        //example1();
        // example2();
        example3();
    }

    public static void example1() {
        System.out.println("Aprendiendo Lombok!");
        Person person = new Person(1L, "Isaias", "Gonzalez", "isaiasgonsales@gmail.com", 23, 1234567890, LocalDate.now());
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Last Name: " + person.getLastName());
        System.out.println("------------------------------------------------");
        System.out.println(person.toString());

        System.out.println("------------------------------------------------");
        Car car = Car.createCar("Toyota", "Corolla", 2020);
        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("------------------------------------------------");
        System.out.println(car.toString());

        System.out.println("------------------------------------------------");
        Phone phone = new Phone("123-456-7890", "iPhone 13", "Apple");
        System.out.println("Modelo del telefono: " + phone.model);
        System.out.println("------------------------------------------------");
        System.out.println(phone.toString());
    }

    public static void example2() {
        Car toyota = Car.createCar("Toyota", "Corolla", 2020);
        Car nissan = Car.createCar("Toyota", "Corolla", 2020);
        System.out.println("Son iguales? " + toyota.equals(nissan));
        System.out.println("Son iguales? " + (toyota == nissan));
    }

    public static void example3() {
        Phone phone = Phone.builder()
                .model("iPhone 13")
                .brand("Apple")
                .build();
        System.out.println(phone.toString());
        Person person1 = Person.create()
                .id(1L)
                .name("Isaias")
                .lastName("Gonzalez")
                .email("isaisGonzales@gmail.com")
                .age(23)
                .phoneNumber(1234567890)
                .dateOfBirth(LocalDate.now())
                .build();
        System.out.println(person1.toString());
        System.out.println("-------------------------");
        log.info(person1.toString());
    }
}
