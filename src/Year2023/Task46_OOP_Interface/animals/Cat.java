package Year2023.Task46_OOP_Interface.animals;

import Year2023.Task46_OOP_Interface.CanRun;
import Year2023.Task46_OOP_Interface.main.Animal;

public class Cat extends Animal implements CanRun {
    @Override
    public void eat() {
        System.out.println("Whishas");
    }
    public void run() {
        System.out.println("Cat runs");
    }
}
