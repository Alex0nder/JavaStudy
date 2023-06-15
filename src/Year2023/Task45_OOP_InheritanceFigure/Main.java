package Year2023.Task45_OOP_InheritanceFigure;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(10);
        System.out.println(rect.area());
        System.out.println(triangle.area());
//        Figure figure = new Figure(5, 5);
//        System.out.println(figure.area());
    }
}
