package Year2023.Task41_OOP_CollectionsArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employess = new ArrayList<>();
//        employess.add("Alex");
//        employess.add("Maks");
//        employess.add("Olga");
//        employess.add("Artem");
//        employess.add("Alina");
//        employess.remove("Olga");

        //Array list
//        for (int i = 0; i < employess.size(); i++) {
//            System.out.println(employess.get(i));
//        }

        //Elements for each
//        for (String name : employess) {
//            System.out.println(name);
//        }
//        int sum = 0;
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            numbers.add(i);
//        }
//        for (int i : numbers) {
//            sum += i;
//        }
//        System.out.println(sum);

        //Collections HashSet
//        HashSet<String> names = new HashSet<>();
//        names.add("Alex");
//        names.add("Max");
//        names.add("Olga");
//        names.add("Artem");
//        names.add("Olga");
//        names.add("Olga"); // Add 1 times amd list random
//        for (String name : names) {
//            System.out.println(name);
//        }
        TreeSet<String> names = new TreeSet<>(); // alphabet
        //TreeSet<Integer> names = new TreeSet<>(); // number list
        names.add("Alex");
        names.add("Max");
        names.add("Olga");
        names.add("Artem");
        names.add("Olga");
        names.add("Olga"); // Add 1 times amd list alphabet order
        for (String name : names) {
            System.out.println(name);
        }
    }
}
