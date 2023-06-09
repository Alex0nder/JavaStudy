package Year2023.Task25_OOP_Methods;

public class Main {
    public static void main(String[] args) {
//        Box myBox = new Box();
//        myBox.height = 10.2;
//        myBox.length = 15;
//        myBox.with = 11.3;
//
//        Box box2 = new Box();
//        box2.height = 5;
//        box2.length = 5;
//        box2.with = 5;
//
//        Box box3 =new Box();
//        box3.height = 10;
//        box3.length = 10;
//        box3.with = 10;
//
//        double volume = myBox.height * myBox.length * myBox.with;
//        double volume2 = box2.height * box2.length * box2.with;
//        double volume3 = box3.height * box3.length * box3.with;
//        System.out.println("Box volume 1 = " + volume + "\nBox volume 2 = " + volume2 + "\nBox volume 3 = " + volume3);

        Box box1 = new Box();
        Box box2 = new Box();
        box1.length = 5;
        box1.with = 5;
        box1.height = 5;

        box2.length = 10;
        box2.with = 10;
        box2.height = 10;

        double volume1 = box1.Volume();
        double volume2 = box2.Volume();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}
