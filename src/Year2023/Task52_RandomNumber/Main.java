package Year2023.Task52_RandomNumber;

public class Main {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 90 + 10);
        String result = String.format("Random number %s. Try again nex time...", random);
        System.out.println(result);
    }
}
