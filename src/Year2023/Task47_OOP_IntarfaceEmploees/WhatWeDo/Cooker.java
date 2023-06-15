package Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo;

import Year2023.Task47_OOP_IntarfaceEmploees.Interface.Cookable;
import Year2023.Task47_OOP_IntarfaceEmploees.main.Employee;

public class Cooker extends Employee implements Cookable {
    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("I cook");
    }
}
