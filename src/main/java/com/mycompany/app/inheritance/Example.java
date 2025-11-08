package com.mycompany.app.inheritance;

public class Example {
    public static void main(String[] args) {
        Employee empl1 = new Employee();
        empl1.setDni("12345678A");
        empl1.setName("John");
        empl1.setLastName("Doe");
        empl1.setEntryDate(java.time.LocalDate.of(2020, 1, 15));
        System.out.println("Employee: " + empl1.toString());
        System.out.println("-----------------------------");

        Manager manager1 = new Manager();
        manager1.setLastName("Jane");
        manager1.setName("Juana");
        manager1.setDni("87654321B");
        manager1.setEntryDate(java.time.LocalDate.of(2019, 5, 20));
        manager1.setAnnualBonus(5000.0);
        manager1.setTeamInCharge(10);
        System.out.println("Manager: " + manager1.toString());
    }
}
