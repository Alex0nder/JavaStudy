package Year2023.Task38_OOP_Collections.main;

public class Main {
    public static void main(String[] args) {
        String[] employees = {
                "Alex",
                "Maria",
                "Alina",
                "Oleg",
                "Maksim",
                "Svetlana"
        };
        //New array "second"
        String[] second = new String[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            second[i] = employees[i];
        }
        //Add new employee Ivan
        second[second.length - 1] = "Ivan";
        employees = second;

        //Delete employee 1
        employees[1] = null;

        //New array "NewNames"
        String[] newNames = new String[employees.length - 1];
        //Go to all array
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newNames[j] = employees[i];
                j++;
            }
        }
        //Add new employees
        employees = newNames;
        for (String name: employees) {
            System.out.println(name);
        }
    }
}
