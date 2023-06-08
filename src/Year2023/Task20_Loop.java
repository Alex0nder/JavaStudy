package Year2023;

public class Task20_Loop {
    public static void main(String[] args) {
        //***** Loop While & if *****
//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//            if (i == 5) {
//                break;
//            }

        //***** Loop While & if - the numbers are divisible by 2 *****
//        int i = 1000;
//        while (i >= 0) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//            i--;
//        }

        //***** Arithmetic mean of numbers from 0 to 100 *****
//        int sum = 0;
//        int count = 0;
//        while (count <= 100) {
//            sum += count;
//            count++;
//        }
//        float result = sum / (float) count;
//        System.out.println(result);

        //***** Loop do while - say Hello 1 time *****
//        int a = 0;
//        do {
//            System.out.println("Hello!");
//        } while (a > 0);

//        for(int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }

        //***** The numbers are divisible by 3 *****
//        for (int i = 1000; i > 0; i--) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//        }

        //***** Print all odd numbers from 100 to 1000, which are divisible by 5 without remainder *****
        for (int i = 100; i <= 1000; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
