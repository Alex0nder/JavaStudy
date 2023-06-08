package Year2023;

public class Task13_WhatCanToEat {
    public static void main(String[] args) {
        //How much have money
        int countOfMoney = 200;

        //Conditions
        if (countOfMoney >= 500) {
            System.out.println("Pizza");
        } else if (countOfMoney >= 200) {
            System.out.println("HotDog");
        } else if (countOfMoney >= 100) {
            System.out.println("Hamburger");
        } else {
            System.out.println("Canned beans");
        }
    }
}
