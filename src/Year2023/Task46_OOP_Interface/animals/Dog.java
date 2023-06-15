package Year2023.Task46_OOP_Interface.animals;

import Year2023.Task46_OOP_Interface.CanRun;
import Year2023.Task46_OOP_Interface.main.Animal;

public class Dog extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Bone");
    }
    public void run() {
        System.out.println("Dog runs");
    }
}
