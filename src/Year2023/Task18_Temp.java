package Year2023;

public class Task18_Temp {
    public static void main(String[] args) {
        int temp = 22;
        int time = 24;
        boolean late = time >= 23;
        boolean hot = temp > 25;
        if (!hot && late) {
            System.out.println("The air conditioner is turned off");
        }
    }
}
