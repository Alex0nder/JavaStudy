package Year2023.Task47_OOP_IntarfaceEmploees.main;

import Year2023.Task47_OOP_IntarfaceEmploees.Interface.CodeWritable;
import Year2023.Task47_OOP_IntarfaceEmploees.Interface.Cookable;
import Year2023.Task47_OOP_IntarfaceEmploees.Interface.Drivable;
import Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo.Cooker;
import Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo.Driver;
import Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo.Programmer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Create Programmers
        Programmer programmer1 = new Programmer("Alex");
        Programmer programmer2 = new Programmer("Alina");
        Programmer programmer3 = new Programmer("Maks");

        Driver driver1 = new Driver("Artem");
        Driver driver2 = new Driver("Anastasia");
        Driver driver3 = new Driver("Vladimir");

        Cooker cooker1 = new Cooker("Olga");
        Cooker cooker2 = new Cooker("Nastya");
        Cooker cooker3 = new Cooker("Sveta");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);

        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);

        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);

        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Drivable driver : drivers) {
            driver.drive();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cookable cookable : cookers) {
            cookable.cook();
        }
    }
}
