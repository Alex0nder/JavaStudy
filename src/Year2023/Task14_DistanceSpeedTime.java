package Year2023;

public class Task14_DistanceSpeedTime {
    public static void main(String[] args) {
        // Formula Distance: s = v × t
        // Formula Speed: v = s / t
        // Formula Time: t = s / v

        // s - speed, v = time, t = time;


        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);
    }
}
