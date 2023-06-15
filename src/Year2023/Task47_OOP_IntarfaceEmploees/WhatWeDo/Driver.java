package Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo;

import Year2023.Task47_OOP_IntarfaceEmploees.Interface.Drivable;
import Year2023.Task47_OOP_IntarfaceEmploees.main.Employee;

public class Driver extends Employee implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("I drive taxi");
    }
}
