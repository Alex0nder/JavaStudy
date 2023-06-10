package Year2023.Task30_OOP_Employee;

public class Employee {
    //Add class Employer, have 3 fields: Name, Job, Salary
    //In constructor have options Initialize all fields
    //Add Methods int, type String return information about information Employee, job and salary when he got i month
    //(value "i" is passed as a parameter

    //And show work methods in class main

    //Employee employee = new employee("Name", "Job", "Salary");
    //String info = employee.getinfo(12)
    //Display Employee Alex, "Designer", for last 12 month he got $20000
    //System.out.printlin(info);

     String name;
     String position;
     int salary;

     Employee(String name, String position, int salary) {
         this.name = name;
         this.position = position;
         this.salary = salary;
     }
     String getInfo(int month) {
         return "Name: " + name + "\nJob: " + position + "\nFor last " + month + " month he got: $" + month * salary;
     }
}
