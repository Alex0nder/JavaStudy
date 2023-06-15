package Year2023.Task47_OOP_IntarfaceEmploees.main;

public abstract class Employee {

    //Create name Employees
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    // Return name Employees
    public String getName() {
        return name;
    }

    // Roll call
    public void voice() {
        System.out.println(name);
    }

}
