package Year2023;

public class Task3_FillingStation {
    //Filling station
    public static void main(String[] args) {
        System.out.println("Fuel cost calculation system");
        //Default fuel and amount
        int fuelType = 95;
        int amount = 50;

        //fuel marker price
        double fuel92price = 60.2;
        double fuel95price = 67.33;

        //Condition fuel if 92=fuel92price, if 95=fuel95price
        double fuelPrice = 0;
        if(fuelType == 92) {
            fuelPrice = fuel92price;
        }
        else if(fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            //If not correct fuel
            System.out.println("Incorrect fuel type is specified");
            amount = 0;
        }

        //if not correct amount
        if(amount < 1) {
            System.out.println("The amount of fuel indicated is too small");
        }

        //Result price fuel
        System.out.println("The price of the selected fuel: " + fuelPrice + " USD");

        //Total cost fuel
        double totalPrice = fuelPrice * amount;
        System.out.println("Total cost of refueling: " + totalPrice + " USD");
    }
}
