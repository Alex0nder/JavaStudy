package Year2023.Task36_OOP_Modifiers.main;

import Year2023.Task36_OOP_Modifiers.Box.Box;
import Year2023.Task36_OOP_Modifiers.test.Man;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Alex", 27);
        System.out.println(man.getAge());
        Box box = new Box();

//        man.setAge(-40);
//        man.age = -40;
//        man.showInfo();
        Year2023.Task35_OOP_ObjectBox.Box box1 = new Year2023.Task35_OOP_ObjectBox.Box(10);
        Year2023.Task35_OOP_ObjectBox.Box box2 = new Year2023.Task35_OOP_ObjectBox.Box(20,20,10);
        Year2023.Task35_OOP_ObjectBox.Box box3 = box1.sumBox(box2);
        Year2023.Task35_OOP_ObjectBox.Box box4 = new Year2023.Task35_OOP_ObjectBox.Box(box1, box3);

        box1.showVolume();
        box2.showVolume();
        box3.showVolume();

        double volumeSum = box1.volume() + box3.volume();
        System.out.println("box1 + box3 = " + volumeSum);
        box4.showVolume();
    }
}
