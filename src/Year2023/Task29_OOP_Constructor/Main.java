package Year2023.Task29_OOP_Constructor;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10,15,20);
        System.out.println(box.volume());
        Box box2 = new Box(30,10,20);
        System.out.println(box2.volume());
    }
}
