package Year2023.Task34_OOP_ObjectsAsParameters;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = box1.increase(3);
        box1.showVolume();
        box2.showVolume();

//        Box box2 = new Box(box1);
//        box1.setDimens(100, 100, 100);

//        int result = box1.compare(box2);

//        Box box = new Box (100);
//        Box box2 = new Box (15, 20, 25);
//        int result = box.compare(box2);

//        switch (result) {
//            case -1:
//                System.out.println("Our box less");
//                break;
//            case 0:
//                System.out.println("Boxes are equal");
//                break;
//            case 1:
//                System.out.println("Our box is bigger");
//        }
    }
}
