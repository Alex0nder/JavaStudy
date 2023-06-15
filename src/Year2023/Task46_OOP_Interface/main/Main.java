
package Year2023.Task46_OOP_Interface.main;

import java.util.ArrayList;

import Year2023.Task46_OOP_Interface.CanRun;
import Year2023.Task46_OOP_Interface.Flyable;
import Year2023.Task46_OOP_Interface.animals.Bird;
import Year2023.Task46_OOP_Interface.animals.Cat;
import Year2023.Task46_OOP_Interface.animals.Dog;
import Year2023.Task46_OOP_Interface.animals.Fish;

// polymorphism
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        CanRun canRun = dog;

        //Down Cast
        dog = (Dog) canRun;

        Flyable flyable = new Bird();
        flyable.fly();

//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        Dog dog3 = new Dog();
//        Dog dog4 = new Dog();
//        Dog dog5 = new Dog();
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();
//        Cat cat4 = new Cat();
//        Cat cat5 = new Cat();
//        Bird bird1 = new Bird();
//        Bird bird2 = new Bird();
//        Bird bird3 = new Bird();
//        Bird bird4 = new Bird();
//        Bird bird5 = new Bird();
//        Fish fish = new Fish();
//        ArrayList<CanRun> animals = new ArrayList<>();
//        animals.add(dog1);
//        animals.add(cat1);
//        animals.add(bird1);
//        animals.add(dog2);
//        animals.add(bird3);
//        animals.add(cat3);
//        for (CanRun animal : animals) {
//            animal.run();
//        }


//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();
//        Bird bird = new Bird();
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(fish);
//        animals.add(bird);
//        for (Animal animal : animals) {
//            animal.eat();
//        }

//        Dog dog1 = new Dog();
//        dog1.run();
//        Animal animal = dog1;
//        animal.eat();
//        dog1 = (Dog) animal;
//        dog1.run();
//        Cat cat1 = new Cat();
//        Animal animal1 = cat1;
//        Dog dog2 = (Dog) animal1;
     }
}
