package Year2023.Task32_OOP_OverloadConstructor;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        Box box2 = new Box(15,20,25);
        Box box3 = new Box();
        box.showVolume();
        box2.showVolume();
        box3.showVolume();
    }
}
