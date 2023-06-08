package Year2023;

public class Task8_CoffeeMachine {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;
        int lowLactoseMilkAmount = 1;

        int cappuccinoMilkRequired = 60;
        int cappuccinoCoffeeRequired = 15;

        boolean isBlocked = true;
        boolean miIsEnough = skimmedMilkAmount >= cappuccinoCoffeeRequired ||
                milkAmount >= cappuccinoCoffeeRequired;
        boolean coffeeIsEnough = coffeeAmount > cappuccinoCoffeeRequired;

        if (!isBlocked && miIsEnough) {
            System.out.println("Make coffee");
        } else {
            System.out.println("Error");
        }

        //Make Cappuccino
//        if (coffeeAmount >= cappuccinoCoffeeRequired &&
//            milkAmount >= cappuccinoMilkRequired) {
//            System.out.println("Make cappuccino");
//        } else {
//            System.out.println("Don't have ingredients ");
//        }



        //Milk have or not
//        if (milkAmount >= cappuccinoMilkRequired ||
//            skimmedMilkAmount >= cappuccinoMilkRequired ) {
//            System.out.println("Milk enough");
//        } else {
//            System.out.println("Don't have milk!");
//        }

        //Coffee machine blocked - 3 conditions
//        if (!isBlocked && milkAmount >= cappuccinoMilkRequired &&
//            coffeeAmount >= cappuccinoCoffeeRequired) {
//            System.out.println("Make coffee");
//        } else {
//            System.out.println("Error");
//        }

        //low Lactose Milk
//        if (skimmedMilkAmount >= cappuccinoMilkRequired ||
//            milkAmount >= cappuccinoMilkRequired ||
//            lowLactoseMilkAmount >= cappuccinoMilkRequired) {
//            System.out.println("Milk enough");
//        } else {
//            System.out.println("Milk not enough");
//        }

        //More conditions
//        if (!isBlocked && coffeeAmount >= cappuccinoCoffeeRequired &&
//           (skimmedMilkAmount >= cappuccinoCoffeeRequired ||
//            milkAmount >= cappuccinoMilkRequired)) {
//            System.out.println("Make cappuccino");
//        } else {
//            System.out.println("Error");
//        }


        //True easy
//        if (true && true && true || true) {
//            System.out.println("Make cappuccino");
//        } else {
//            System.out.println("Error");
//        }
    }
}
