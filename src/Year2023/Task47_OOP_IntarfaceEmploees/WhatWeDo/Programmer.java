package Year2023.Task47_OOP_IntarfaceEmploees.WhatWeDo;

import Year2023.Task47_OOP_IntarfaceEmploees.Interface.CodeWritable;
import Year2023.Task47_OOP_IntarfaceEmploees.main.Employee;

public class Programmer extends Employee implements CodeWritable {
  public Programmer(String name) {
      super(name);
  }

    @Override
    public void writeCode() {
        System.out.println("I write code");
    }
}
