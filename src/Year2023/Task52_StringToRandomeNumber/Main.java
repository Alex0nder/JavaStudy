package Year2023.Task52_StringToRandomeNumber;

public class Main {
    public static void main(String[] args) {
        // Inheritance objects
        // in you have classes without System.out.println();
        // Then add argument System.out.println(Array);
        // You got array.Array@12345 - it's Inheritance all objects have java from object
        //

//        Empty empty = new Empty();
//        // empty. - have all methods
//        // for example
//        empty.toString(); // show to string, result don't change
//        System.out.println(empty);

        // Random number
//        double random = Math.random();
//        random *= 6;
//        int randomInt = (int) random;
//        randomInt++;

        // New type + random number
        int result = (int) (Math.random() * 6 + 1);
        System.out.println(result);
    }
}
