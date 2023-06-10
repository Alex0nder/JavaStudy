package Year2023.Task31_OOP_Overload;

public class Test {
    static int multiple(int a, int b) {
        return a * b;
    }
    static double multiple(double a, double b) {
        return a - b;
    }
    //If the method is the same and behaves independently of the objects, then we can add a static
    static int multiple(int a) {
        return a * a;
    }
}
