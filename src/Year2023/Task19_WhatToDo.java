package Year2023;

public class Task19_WhatToDo {
    public static void main(String[] args) {
        int time = 15;
        boolean isGoodWeather = false;
        boolean late = time >= 23 || time <= 5;
        if (late) {
            System.out.println("Sleep");
        }
        if (!late && isGoodWeather) {
            System.out.println("Go to walk");
        }
        if (!late && !isGoodWeather) {
            System.out.println("Read book");
        }
    }
}
