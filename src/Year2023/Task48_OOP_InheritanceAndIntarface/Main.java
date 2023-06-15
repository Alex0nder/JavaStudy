package Year2023.Task48_OOP_InheritanceAndIntarface;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
//        Cooker cooker = new Cooker();
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cook");
            }
        });
    }
}
