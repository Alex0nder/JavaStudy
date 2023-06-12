package Year2023.Task38_OOP_Collections.employees;

public class Employees {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Alex");
        employees.add("Alina");
        employees.add("Marina");
        employees.add("Igor");
        employees.add("Maksim");
        employees.add("Svetlana");
        employees.add("Anastasia");
        employees.add("Artem");
        employees.add("Irina");
        employees.add("Anton");

        employees.remove("Marina");
        employees.remove("Anton");

        // Delete employees
//        employees.remove(2);

        // Add 100 employees with basic name
//        for (int i = 0; i < 100; i++) {
//            employees.add("Employees " + i);
//        }

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
