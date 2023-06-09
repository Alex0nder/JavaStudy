package Year2023.Task26_OOP_MethodsDog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Leila";
        dog.breed = "Dachshund";
        dog.speed = 10;
        dog.run();
        System.out.println(dog.info());
    }
}
