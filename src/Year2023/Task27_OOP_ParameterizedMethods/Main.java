package Year2023.Task27_OOP_ParameterizedMethods;

public class Main {
    public static void main(String[] args) {
//        //New object Test
//        Test test = new Test();
//
//        //parameterized methods 80
//        int square = test.square(80);
//        // it's looks like basic Math.sqrt
//        // double sqrt = Math.sqrt(80)
//        System.out.println(square);

        Box box = new Box();
        box.setDimens(15, 15, 15);
        //calculate the volume
        System.out.println(box.volume());
    }
}
