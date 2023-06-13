package Year2023.Task42_OOP_ArrayListName;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Arraylist Numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        //Arraylist Names
        ArrayList<String> names = new ArrayList<>();
        //Arraylist Names and Numbers
        ArrayList<String> namesAndNumbers = new ArrayList<>();

        //Loop add numbers
        for(int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Andrei");
        names.add("Katya");
        names.add("Nastya");
        names.add("Andton");
        names.add("Jenia");
        names.add("Dima");
        names.add("Kolia");
        names.add("Maria");
        names.add("Roman");
        names.add("Pavel");

        //Loop add — after numbers + name
        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " — " + names.get(i);
            namesAndNumbers.add(s);
        }

        //Display numbers + name
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }
    }
}
