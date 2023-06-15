package Year2023.Task46_OOP_Interface.animals;

import Year2023.Task46_OOP_Interface.CanRun;
import Year2023.Task46_OOP_Interface.Flyable;
import Year2023.Task46_OOP_Interface.main.Animal;

public class Bird extends Animal implements CanRun, Flyable {


    @Override
    public void eat() {
        System.out.println("Bird food");
    }

    @Override
    public void run() {
        System.out.println("Bird Run");
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
