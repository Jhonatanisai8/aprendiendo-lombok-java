package com.mycompany.app;

import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Person person = new Person(1L, "Isaias", "Gonzalez", "isaiasgonsales@gmail.com", 23, 1234567890, LocalDate.now());
        System.out.println("Person Name: " + person.getName());
        System.out.println("Person Last Name: " + person.getLastName());

        System.out.println("------------------------------------------------");
    }
}
