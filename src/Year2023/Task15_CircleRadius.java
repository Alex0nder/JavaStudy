package Year2023;

public class Task15_CircleRadius {
    public static void main(String[] args) {
        // Formula circle radius: A = πr2;
        // Formula radius: r = C / 2π
        // Formula circumference: C = 2πr
        // A = area, R = radius, C = circumference, π = 3.14;

        double r = 10.8;
        double pi = 3.14;
        double s = pi * r * r;
        System.out.println("The area of a circle is " + s);
    }
}
