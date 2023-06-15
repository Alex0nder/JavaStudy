package Year2023.Task44_OOP_InheritanceBoxWeight.main;

import Year2023.Task44_OOP_InheritanceBoxWeight.box.Box;
import Year2023.Task44_OOP_InheritanceBoxWeight.box.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10, 20, 30, 15.6);
        box.showInfo();
        boxWeight.showInfo();
    }
}
